package tk.tukuteam.ayudacompraApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.UserModel;
import tk.tukuteam.ayudacompraApi.repository.UserRepository;
@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/{email}")
	public UserModel getUserFromEmail(@PathVariable("email") String email) {
		
		return userRepo.findByEmail(email).get(0);
	}
}
