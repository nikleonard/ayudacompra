package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.Userstatus;

public interface UserStatusRepository extends CrudRepository<Userstatus, UUID> {
	List<Userstatus> findByStatusname(String statusname);
}
