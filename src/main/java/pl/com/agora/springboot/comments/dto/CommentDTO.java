package pl.com.agora.springboot.comments.dto;


public class CommentDTO {

	private String articleId;
    private String author;
    private String content;

	public String getContent() {
		return content;
	}
	public String getAuthor() {
		return author;
	}
	public String getArticleId() {
		return articleId;
	}
	
	public CommentDTO() {
	}

	public CommentDTO(String articleId, String author, String content) {
		super();
		this.articleId = articleId;
		this.author = author;
		this.content = content;
	}
	@Override
	public String toString() {
		return "CommentDTO [articleId=" + articleId + ", author=" + author
				+ ", content=" + content + "]";
	}

	
}
