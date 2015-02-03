package pl.com.agora.springboot.comments.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.com.agora.springboot.comments.dto.CommentDTO;
import pl.com.agora.springboot.comments.service.CommentsService;


@RestController
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	private final static Logger logger = LoggerFactory
			.getLogger(CommentsController.class);
	
	@RequestMapping(value = "/putComment", method = { RequestMethod.POST })
    public void putComment(@RequestBody CommentDTO commentDTO) {
    			
		
		logger.info("received comment : " + commentDTO);
		commentsService.putComment(commentDTO);
				
    }
	
	@RequestMapping(value = "/{articleId}", method = { RequestMethod.GET, RequestMethod.POST })
    public @ResponseBody List<CommentDTO> getComments(@PathVariable("articleId") String articleId) {
    	
		logger.info("requested by articleId : " + articleId);
		List<CommentDTO> commentDTOs = commentsService.getComments(articleId);
		
		return commentDTOs;
    }
}
