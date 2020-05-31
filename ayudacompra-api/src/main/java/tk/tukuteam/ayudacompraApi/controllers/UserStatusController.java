package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Userstatus;
import tk.tukuteam.ayudacompraApi.repository.UserStatusRepository;

@RestController
@RequestMapping(value="/api/v1/userstatus")
public class UserStatusController {
	@Autowired
	UserStatusRepository statusRepo;
	
	@GetMapping("/name/{statusname}")
	public List<Userstatus> getUserStatusByUID(@PathVariable("statusname") String statusname){
		List<Userstatus> status = statusRepo.findByStatusname(statusname);
		return status;
	}
}
