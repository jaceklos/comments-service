package pl.com.agora.springboot.comments.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.com.agora.springboot.comments.entity.Comment;

public interface CommentsDAO extends JpaRepository<Comment, Integer> {

	@Query("SELECT c FROM Comment c WHERE c.articleId = ?1")
    List<Comment> findByArticleId(String articleId);
}
