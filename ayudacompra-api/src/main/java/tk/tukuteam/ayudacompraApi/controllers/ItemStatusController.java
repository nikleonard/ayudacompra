package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Itemstatus;
import tk.tukuteam.ayudacompraApi.repository.ItemStatusRepository;

@RestController
@RequestMapping(value="/api/v1/itemstatus")
public class ItemStatusController {
	@Autowired
	ItemStatusRepository itemstatusRepo;
	
	
	@GetMapping("/name/{item_status_name}")
	public List<Itemstatus> getUserStatusByUID(@PathVariable("item_status_name") String item_status_name){
		List<Itemstatus> itemstatus = itemstatusRepo.findByItemstatus(item_status_name);
		return itemstatus;
	}
}
