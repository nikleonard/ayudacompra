package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.CommentType;
import tk.tukuteam.ayudacompraApi.repository.CommentTypeRepository;

@RestController
@RequestMapping(value="/api/v1/commenttype")
public class CommentTypeController {
	@Autowired
	CommentTypeRepository typeRepo;
		
	@GetMapping("/name/{commentTypeName}")
	public List<CommentType> getCommentTypeByUID(@PathVariable("commentTypeName") String commentTypeName){
		return typeRepo.findByCommentTypeName(commentTypeName);
	}
}
