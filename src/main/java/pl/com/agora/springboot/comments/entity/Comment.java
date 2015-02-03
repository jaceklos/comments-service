package pl.com.agora.springboot.comments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer commentId;
	
	@Column
	private String content;
	
	@Column
	private String author;
	
	@Column
	private Integer articleId;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}	
	public Integer getCommentId() {
		return commentId;
	}
	
	public Comment() {
	}
	
	public Comment(String content, String author, Integer articleId) {
		super();
		this.content = content;
		this.author = author;
		this.articleId = articleId;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", content=" + content
				+ ", author=" + author + ", articleId=" + articleId + "]";
	}
	
	
	
	
}
