package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.WarningType;
import tk.tukuteam.ayudacompraApi.repository.WarningTypeRepository;

@RestController
@RequestMapping(value="/api/v1/warningtype")
public class WarningTypeController {
	@Autowired
	WarningTypeRepository warningTypeRepo;
	
	@GetMapping("/name/{warningtype}")
	public List<WarningType> getTypeFromWarning(@PathVariable("warningtype") String warningtype){
	List<WarningType> type = warningTypeRepo.findByWarningType(warningtype);
	return type;
	
	}
	

}
