package pl.com.agora.springboot.comments.dao;

import pl.com.agora.springboot.comments.dto.CommentDTO;

public interface CommentsRemoteDAO {

	void save(CommentDTO commentDTO);
}
