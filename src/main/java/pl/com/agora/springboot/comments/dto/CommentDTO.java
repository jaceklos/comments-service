package pl.com.agora.springboot.comments.dto;


public class CommentDTO {

	private String content;
	private String author;
	private Integer articleId;

	public String getContent() {
		return content;
	}
	public String getAuthor() {
		return author;
	}
	public Integer getArticleId() {
		return articleId;
	}
	
	public CommentDTO() {
	}

	public CommentDTO(String content, String author, Integer articleId) {
		this.content = content;
		this.author = author;
		this.articleId = articleId;
	}

	@Override
	public String toString() {
		return "CommentDTO [content=" + content + ", author=" + author
				+ ", articleId=" + articleId + "]";
	}	
	
}
