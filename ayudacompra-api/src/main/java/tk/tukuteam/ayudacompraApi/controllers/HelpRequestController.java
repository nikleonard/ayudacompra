package tk.tukuteam.ayudacompraApi.controllers;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tk.tukuteam.ayudacompraApi.repository.HelpRequestRepository;
import tk.tukuteam.ayudacompraApi.model.HelpRequest;

@RestController
@RequestMapping(value="/api/v1/helprequest")
public class HelpRequestController {
	@Autowired
	private HelpRequestRepository HelpRequestRepo;
	
	@GetMapping("/{title}")
	public List<HelpRequest> getTitlefromHelpRequest(@PathVariable("title") String title){
		return HelpRequestRepo.findBytitle(title);	
	}
	
	@GetMapping("/{dateCreated}")
	public List<HelpRequest> getDateCreatedfromHelpRequest(@PathVariable("dateCreated") Date dateCreated){
		return HelpRequestRepo.findByDateCreated(dateCreated);
	}
	
	@GetMapping("/{dateExpiration}")
	public List<HelpRequest> getDateExpirationfromHelpRequest(@PathVariable("dateExpiration") Date dateExpiration){
		return HelpRequestRepo.findByDateExpiration(dateExpiration);	
	}
	
	@GetMapping("/{dateCompleted}")
	public List<HelpRequest> getDateCompletedfromHelpRequest(@PathVariable("dateCompleted") Date dateCompleted){
		return HelpRequestRepo.findByDateCompleted(dateCompleted);	
	}
	
	@GetMapping("/{idUserNeedy}")
	public List<HelpRequest> getIdUserNeedyfromHelpRequest(@PathVariable("idUserNeedy") UUID idUserNeedy){
		return HelpRequestRepo.findByIdUserNeedy(idUserNeedy);	
	}
	
	@GetMapping("/{idAddress}")
	public List<HelpRequest> getIdAddressNeedyfromHelpRequest(@PathVariable("idAddress") UUID idAddress){
		return HelpRequestRepo.findByIdAddress(idAddress);	
	}
	
	@GetMapping("/{idCommentOrder}")
	public List<HelpRequest> getIdCommentOrderfromHelpRequest(@PathVariable("idCommentOrder") UUID idCommentOrder){
		return HelpRequestRepo.findByIdCommentOrder(idCommentOrder);	
	}
		
	@GetMapping("/{idUserHelper}")
	public List<HelpRequest> getIdUserHelperfromHelpRequest(@PathVariable("idUserHelper") UUID idUserHelper){
		return HelpRequestRepo.findByIdUserHelper(idUserHelper);	
	}
	
	@GetMapping("/{idHelpRequestStatus}")
	public List<HelpRequest> getIdHelpRequestStatusfromHelpRequest(@PathVariable("idHelpRequestStatus") UUID idHelpRequestStatus){
		return HelpRequestRepo.findByIdHelpRequestStatus(idHelpRequestStatus);
	}
	
	

}
