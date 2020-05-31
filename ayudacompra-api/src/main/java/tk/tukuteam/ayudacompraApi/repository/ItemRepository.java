package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.Items;

public interface ItemRepository extends CrudRepository<Items, UUID>{
	List<Items> findByQuantity(int quantity);
	List<Items> findByItemName(String itemName);
	List<Items> findByIdItemStatus(UUID idItemStatus);
	List<Items> findByIdHelpRequest(UUID idHelpRequest);
	
}
