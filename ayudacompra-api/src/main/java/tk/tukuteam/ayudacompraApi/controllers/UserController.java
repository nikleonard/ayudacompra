package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.User;
import tk.tukuteam.ayudacompraApi.repository.UserRepository;
@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/{userEmail}")
	public List<User> getUserFromEmail(@PathVariable("userEmail") String userEmail) {
		return userRepo.findByUserEmail(userEmail);
	}
}
