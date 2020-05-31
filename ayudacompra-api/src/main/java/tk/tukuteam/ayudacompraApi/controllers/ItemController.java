package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Item;
import tk.tukuteam.ayudacompraApi.repository.ItemRepository;

@RestController
@RequestMapping(value="/api/v1/item")
public class ItemController {
	@Autowired
	private ItemRepository itemRepo;
	
	@GetMapping("/{quantity}")
	public List<Item> getQuantityFromItem(@PathVariable("quantity") int quantity) {
		return itemRepo.findByQuantity(quantity);
	}
	
	@GetMapping("/{itemName}")
	public List<Item> getItemFromName(@PathVariable("itemName") String itemName){
		return itemRepo.findByItemName(itemName);
	}
	
	@GetMapping("/{idItemStatus}")
	public List<Item> getItemfromStatus(@PathVariable("idItemStatus") UUID idItemStatus){
		return itemRepo.findByIdItemStatus(idItemStatus);
	}
	@GetMapping("/{idHelpRequest}")
	public List<Item> getItemfromHelpRequest(@PathVariable("idHelpRequest") UUID idHelpRequest) {
		return itemRepo.findByIdHelpRequest(idHelpRequest);
	}
	
}
