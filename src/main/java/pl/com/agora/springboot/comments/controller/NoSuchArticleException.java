package pl.com.agora.springboot.comments.controller;

public class NoSuchArticleException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4379896231995127558L;

	public NoSuchArticleException(String arg0) {
		super(arg0);
	}
	
	
}
