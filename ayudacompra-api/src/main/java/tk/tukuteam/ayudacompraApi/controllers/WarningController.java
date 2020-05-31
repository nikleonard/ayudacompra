package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Warning;
import tk.tukuteam.ayudacompraApi.repository.WarningRepository;
@RestController
@RequestMapping(value="/api/v1/warning")
public class WarningController {
	@Autowired
	private WarningRepository warningRepo;
	
	@GetMapping("/type/{idWarningType}")
	public List<Warning> getWarningByIdWarningType(@PathVariable("idWarningType") UUID idWarningType) {
		return warningRepo.findByIdWarningType(idWarningType);
	}
	
	@GetMapping("/from/{idUserFrom}")
	public List<Warning> getWarningByIdUserFrom(@PathVariable("idUserFrom") UUID idUserFrom) {
		return warningRepo.findByIdUserFrom(idUserFrom);
	}
	
	@GetMapping("/to/{idUserTo}")
	public List<Warning> getWarningByIdUserTo(@PathVariable("idUserTo") UUID idUserTo) {
		return warningRepo.findByIdUserTo(idUserTo);
	}
	
	@GetMapping("/comment/{idTextComments}")
	public List<Warning> getWarningByIdTextComments(@PathVariable("idTextComments") UUID idTextComments) {
		return warningRepo.findByIdTextComments(idTextComments);
	}
	
	@GetMapping("/request/{idHelpRequest}")
	public List<Warning> getWarningByIdHelpRequest(@PathVariable("idHelpRequest") UUID idHelpRequest) {
		return warningRepo.findByidHelpRequest(idHelpRequest);
	}
	
	@GetMapping("/address/{idAddressNeedy}")
	public List<Warning> getWarningByIdAddressNeedy(@PathVariable("idAddressNeedy") UUID idAddressNeedy) {
		return warningRepo.findByIdAddressNeedy(idAddressNeedy);
	}
}
