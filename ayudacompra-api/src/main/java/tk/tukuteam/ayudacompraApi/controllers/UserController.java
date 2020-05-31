package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

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
	
	@GetMapping("/first/{firstName}")
	public List<User> getUserByFirstName(@PathVariable("firstName") String firstName){
		return userRepo.findByFirstName(firstName);
	}
	
	@GetMapping("/last/{lastName}")
	public List<User> getUserByLastName(@PathVariable("lastName") String lastName){
		return userRepo.findByLastName(lastName);
	}
	
	@GetMapping("/{contactNumber}")
	public List<User> getUserByContactNUmber(@PathVariable("contactNumber") int contactNumber){
		return userRepo.findByContactNumber(contactNumber);
	}
	
	@GetMapping("/name/{userName}")
	public List<User> getUserByUserName(@PathVariable("userName") String userName){
		return userRepo.findByUserName(userName);
	}
	
	@GetMapping("/pass/{userPassword}")
	public List<User> getUserByUserPassword(@PathVariable("userPassword") String userPassword){
		return userRepo.findByUserPassword(userPassword);
	}
	
	@GetMapping("/email/{userEmail}")
	public List<User> getUserFromEmail(@PathVariable("userEmail") String userEmail) {
		return userRepo.findByUserEmail(userEmail);
	}
	
	@GetMapping("/{idUserStatus}")
	public List<User> getUserByUserStatus(@PathVariable("idUserStatus") UUID idUserStatus){
		return userRepo.findByIdUserStatus(idUserStatus);
	}
	
}
