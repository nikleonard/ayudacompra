package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.ItemStatus;
import tk.tukuteam.ayudacompraApi.repository.ItemStatusRepository;

@RestController
@RequestMapping(value="/api/v1/itemstatus")
public class ItemStatusController {
	@Autowired
	ItemStatusRepository itemstatusRepo;
	
	
	@GetMapping("/name/{itemStatusName}")
	public List<ItemStatus> getUserStatusByUID(@PathVariable("itemStatusName") String itemStatusName){
		List<ItemStatus> itemstatus = itemstatusRepo.findByItemStatusName(itemStatusName);
		return itemstatus;
	}
}
