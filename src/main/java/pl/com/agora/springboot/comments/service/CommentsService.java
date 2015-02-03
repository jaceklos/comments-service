package pl.com.agora.springboot.comments.service;

import java.util.List;

import pl.com.agora.springboot.comments.dto.CommentDTO;

public interface CommentsService {
	
	void putComment(CommentDTO comment);
	
	List<CommentDTO> getComments(Integer articleId);
}
