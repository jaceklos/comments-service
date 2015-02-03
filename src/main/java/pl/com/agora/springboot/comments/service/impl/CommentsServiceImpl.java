package pl.com.agora.springboot.comments.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.com.agora.springboot.comments.dao.CommentsDAO;
import pl.com.agora.springboot.comments.dto.CommentDTO;
import pl.com.agora.springboot.comments.entity.Comment;
import pl.com.agora.springboot.comments.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	private CommentsDAO commentsDAO;
//	@Autowired
//    private WebResource webResource;
//	
//	public void sendComment(Comment comment) throws IOException,
//			JsonGenerationException, JsonMappingException, ConnectException {
//		webResource.path("/putComment")
//        .type(MediaType.APPLICATION_JSON)
//        .accept(MediaType.APPLICATION_JSON)
//        .post(ClientResponse.class, new ObjectMapper().writeValueAsString(result));
//		
//	}
	
	public List<CommentDTO> getComments(Integer articleId) {
		
		List<Comment> comments = commentsDAO.findByArticleId(articleId);		
		return convertToDTOs(comments);
	}
	
	public void putComment(CommentDTO commentDTO) {		
		commentsDAO.saveAndFlush(convertToEntity(commentDTO));
	}	
	
	private List<CommentDTO> convertToDTOs(List<Comment> comments){
		List<CommentDTO> commentDTOs = new ArrayList<CommentDTO>();
		
		for (Comment comment : comments){
			commentDTOs.add(new CommentDTO(comment.getContent(), comment.getAuthor(), comment.getArticleId()));					
		}
		return commentDTOs;
	}
	
	private Comment convertToEntity(CommentDTO commentDTO){
		return new Comment(commentDTO.getContent(), commentDTO.getAuthor(), commentDTO.getArticleId());
	}
		
}
