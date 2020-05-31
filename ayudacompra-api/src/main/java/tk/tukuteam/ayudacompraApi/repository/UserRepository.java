package tk.tukuteam.ayudacompraApi.repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.User;

public interface UserRepository extends CrudRepository<User,UUID> {
	
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
	List<User> findByContactNumber(int contactNumber);
	List<User> findByUserName(String userName);
	List<User> findByUserPassword(String userPassword); 
	List<User> findByUserEmail(String userEmail);
	List<User> findByIdUserStatus(UUID idUserStatus);
	List<User> findByProfileUrl(String profileUrl);
	
}