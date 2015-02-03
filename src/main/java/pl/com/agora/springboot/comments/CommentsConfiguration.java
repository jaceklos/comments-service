package pl.com.agora.springboot.comments;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class CommentsConfiguration {
	
	@Bean
	public CommentClient commentClient(
			@Value("${commentsPresentation.url}") String url,
			@Value("${commentsPresentation.port}") int port) throws Exception {
		return new CommentClientFactory().createSimpleCommentClient(
				url, port);
	}
}
