package pl.com.agora.springboot.comments.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.com.agora.springboot.comments.dao.CommentsDAO;
import pl.com.agora.springboot.comments.dao.CommentsRemoteDAO;
import pl.com.agora.springboot.comments.dto.CommentDTO;
import pl.com.agora.springboot.comments.entity.Comment;
import pl.com.agora.springboot.comments.exception.CommentStoreException;
import pl.com.agora.springboot.comments.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	private CommentsDAO commentsDAO;
	
	@Autowired
	private CommentsRemoteDAO commentsRemoteDAO;
	
	public List<CommentDTO> getComments(String articleId) {
		
		List<Comment> comments = commentsDAO.findByArticleId(articleId);		
		return convertToDTOs(comments);
	}
	
	public void putComment(CommentDTO commentDTO) {
		 
		try{
			Comment comment = new Comment(commentDTO.getArticleId(), commentDTO.getAuthor(), commentDTO.getContent());
			commentsDAO.saveAndFlush(comment);
			commentsRemoteDAO.save(commentDTO);
		}catch (Exception e) {
			throw new CommentStoreException(String.format("cannot store comment[%s] in database.", commentDTO) , e);
		}
		
	}	
	
	private List<CommentDTO> convertToDTOs(List<Comment> comments){
		List<CommentDTO> commentDTOs = new ArrayList<CommentDTO>();
		
		for (Comment comment : comments){
			commentDTOs.add(new CommentDTO(comment.getArticleId(), comment.getAuthor(), comment.getContent()));					
		}
		return commentDTOs;
	}
		
}
