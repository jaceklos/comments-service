package pl.com.agora.springboot.comments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommentsApplication {

	private final static Logger logger = LoggerFactory
			.getLogger(CommentsApplication.class);
	
	public static void main(String[] args) throws Exception {

		try {

			SpringApplication.run(new Object[] { CommentsConfiguration.class,
					CommentsApplication.class }, args);

		} catch (Exception e) {
			logger.error("cannot run Comments Service", e);
			throw e;
		}	
	}

}
