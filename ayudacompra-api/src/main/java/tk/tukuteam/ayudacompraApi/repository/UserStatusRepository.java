package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.UserStatus;

public interface UserStatusRepository extends CrudRepository<UserStatus, UUID> {
	List<UserStatus> findByUserStatusName(String userStatusName);
}
