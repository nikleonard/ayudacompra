package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.HelpRequestStatus;
import tk.tukuteam.ayudacompraApi.repository.HelpRequestStatusRepository;

@RestController
@RequestMapping(value="/api/v1/helprequeststatus")
public class HelpRequestStatusController {
	@Autowired
	HelpRequestStatusRepository HelpRequestStatusRepo;
	
	@GetMapping("/name/{helpRequestStatusName}")
	public List<HelpRequestStatus> getUserStatusByUID(@PathVariable("helprequeststatusname") String helprequeststatusname){
		List<HelpRequestStatus> helprequeststatus = HelpRequestStatusRepo.findByHelpRequestStatusName(helprequeststatusname);
		return helprequeststatus;
	}
	
	
	
	

	
}
