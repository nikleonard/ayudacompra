package tk.tukuteam.ayudacompraApi.repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.UserApp;

public interface UserAppRepository extends CrudRepository<UserApp,UUID> {
	
	List<UserApp> findByFirstName(String firstName);
	List<UserApp> findByLastName(String lastName);
	List<UserApp> findByContactNumber(int contactNumber);
	List<UserApp> findByUserName(String userName);
	List<UserApp> findByUserPassword(String userPassword); 
	List<UserApp> findByUserEmail(String userEmail);
	List<UserApp> findByIdUserStatus(UUID idUserStatus);
	List<UserApp> findByProfileUrl(String profileUrl);
	
}