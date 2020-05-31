package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.Warning;

public interface WarningRepository extends CrudRepository<Warning, UUID>{
	
	List<Warning> findByIdWarningType(UUID idWarningType);
	List<Warning> findByIdUserFrom(UUID idUserFrom);
	List<Warning> findByIdUserTo(UUID idUserTo);
	List<Warning> findByIdTextComments(UUID idTextComments);
	List<Warning> findByidHelpRequest(UUID idHelpRequest);
	List<Warning> findByIdAddressNeedy(UUID idAddressNeedy);

}
