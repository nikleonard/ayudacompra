package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.ItemStatus;

public interface ItemStatusRepository  extends CrudRepository<ItemStatus, UUID>{
	List<ItemStatus> findByItemStatusName(String itemStatusName);

}
