package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.TextComments;
import tk.tukuteam.ayudacompraApi.repository.TextCommentsRepository;

@RestController
@RequestMapping(value="/api/v1/textcontroller")
public class TextCommentsController {
	
	@Autowired
	TextCommentsRepository commentRepo;
	
	@GetMapping("/{idCommentType}")
	public List<TextComments> getTextCommentFromIdCommentType(@PathVariable("idCommentType") UUID idCommentType) {

		return commentRepo.findByIdCommentType(idCommentType);
		
	}
	
	@GetMapping("/comment/{contentComment}")
	public List<TextComments> getTextCommentFromContentComment(@PathVariable("contentComment") String contentComment) {

		return commentRepo.findByContentComment(contentComment);
		
	}

}
