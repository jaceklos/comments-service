package pl.com.agora.springboot.comments.exception;

public class CommentStoreException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4379896231995127558L;

	public CommentStoreException(String arg0) {
		super(arg0);
	}
	
	public CommentStoreException(String message, Throwable cause) {
		super(message, cause);
	}
}
