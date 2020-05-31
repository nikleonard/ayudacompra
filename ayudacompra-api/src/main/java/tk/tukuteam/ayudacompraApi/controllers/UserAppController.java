package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.UserApp;
import tk.tukuteam.ayudacompraApi.repository.UserAppRepository;
@RestController
@RequestMapping(value="/api/v1/user")
public class UserAppController {
	@Autowired
	private UserAppRepository userRepo;
	
	@GetMapping("/first/{firstName}")
	public List<UserApp> getUserByFirstName(@PathVariable("firstName") String firstName){
		return userRepo.findByFirstName(firstName);
	}
	
	@GetMapping("/last/{lastName}")
	public List<UserApp> getUserByLastName(@PathVariable("lastName") String lastName){
		return userRepo.findByLastName(lastName);
	}
	
	@GetMapping("/{contactNumber}")
	public List<UserApp> getUserByContactNUmber(@PathVariable("contactNumber") int contactNumber){
		return userRepo.findByContactNumber(contactNumber);
	}
	
	@GetMapping("/name/{userName}")
	public List<UserApp> getUserByUserName(@PathVariable("userName") String userName){
		return userRepo.findByUserName(userName);
	}
	
	@GetMapping("/pass/{userPassword}")
	public List<UserApp> getUserByUserPassword(@PathVariable("userPassword") String userPassword){
		return userRepo.findByUserPassword(userPassword);
	}
	
	@GetMapping("/email/{userEmail}")
	public List<UserApp> getUserFromEmail(@PathVariable("userEmail") String userEmail) {
		return userRepo.findByUserEmail(userEmail);
	}
	
	@GetMapping("/{idUserStatus}")
	public List<UserApp> getUserByUserStatus(@PathVariable("idUserStatus") UUID idUserStatus){
		return userRepo.findByIdUserStatus(idUserStatus);
	}
	
	@GetMapping("/url/{profileUrl}")
	public List<UserApp> getUserFromProfileUrl(@PathVariable("profileUrl") String profileUrl) {
		return userRepo.findByProfileUrl(profileUrl);
	}
	
}
