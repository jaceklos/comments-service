package pl.com.agora.springboot.comments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class CommentsConfiguration {

	private final static Logger logger = LoggerFactory
			.getLogger(CommentsConfiguration.class);

//	@Value("${hazelcastConfigPathname}")
//	private String hazelcastConfigPathname;

//	@Bean
//	public HazelcastInstance getHazelcast() throws Exception {
//
//		HazelcastInstance hazelcastInstance = null;
//
//		try {
//			Config config = new XmlConfigBuilder(hazelcastConfigPathname)
//					.build();
//			hazelcastInstance = Hazelcast.newHazelcastInstance(config);
//		} catch (FileNotFoundException e) {
//			logger.error("cannot find such hazelcast configuration file : "
//					+ hazelcastConfigPathname, e);
//			throw e;
//		}
//
//		return hazelcastInstance;
//	}
}
