package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.Itemstatus;

public interface ItemStatusRepository  extends CrudRepository<Itemstatus, UUID>{
	List<Itemstatus> findByItemstatus(String item_status_name);

}
