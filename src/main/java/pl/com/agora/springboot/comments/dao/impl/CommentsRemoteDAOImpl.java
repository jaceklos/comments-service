package pl.com.agora.springboot.comments.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.com.agora.springboot.comments.Comment;
import pl.com.agora.springboot.comments.CommentClient;
import pl.com.agora.springboot.comments.dao.CommentsRemoteDAO;
import pl.com.agora.springboot.comments.dto.CommentDTO;

@Service
public class CommentsRemoteDAOImpl implements CommentsRemoteDAO{

	@Autowired
	public CommentClient commentClient;
	
	private final static Logger logger = LoggerFactory
			.getLogger(CommentsRemoteDAOImpl.class);
	
	@Override
	public void save(CommentDTO commentDTO) {
			
		try{
			Comment comment = new Comment(commentDTO.getArticleId(), commentDTO.getAuthor(), commentDTO.getContent());
			commentClient.putComment(comment, comment.getArticleId());
		}catch(Exception e){
			
			logger.error(String.format("cannot save comment[%s] in remote repository", commentDTO), e);
		}
		
	}
	 
}
