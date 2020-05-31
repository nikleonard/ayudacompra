package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.Item;

public interface ItemRepository extends CrudRepository<Item, UUID>{
	List<Item> findByQuantity(int quantity);
	List<Item> findByItemName(String itemName);
	List<Item> findByIdItemStatus(UUID idItemStatus);
	List<Item> findByIdHelpRequest(UUID idHelpRequest);
	
}
