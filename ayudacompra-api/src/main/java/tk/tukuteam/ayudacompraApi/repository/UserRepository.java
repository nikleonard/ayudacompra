package tk.tukuteam.ayudacompraApi.repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.*;

public interface UserRepository extends CrudRepository<UserModel,UUID> {
	List<UserModel> findByEmail(String email);
}
