package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Items;
import tk.tukuteam.ayudacompraApi.repository.ItemRepository;

@RestController
@RequestMapping(value="/api/v1/item")
public class ItemController {
	@Autowired
	private ItemRepository itemRepo;
	
	@GetMapping("/{idRequest}")
	public List<Items> getItemFromIdRequest(@PathVariable("idRequest") String idRequest){
		return itemRepo.findByIdHelpRequest(UUID.fromString(idRequest));
	}

	
}
