package pl.com.agora.springboot.comments.exception;

public class CommentSendException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4379896231995127558L;

	public CommentSendException(String arg0) {
		super(arg0);
	}
	
	public CommentSendException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
