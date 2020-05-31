package tk.tukuteam.ayudacompraApi.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.HelpRequest;

public interface HelpRequestRepository extends CrudRepository<HelpRequest, UUID>{
	List<HelpRequest> findBytitle (String title);
	List<HelpRequest> findByDateCreated (Date dateCreated);
	List<HelpRequest> findByDateExpiration(Date dateExpiration);
	List<HelpRequest> findByDateCompleted(Date dateCompleted);
	List<HelpRequest> findByIdUserNeedy(UUID idUserNeedy);
	List<HelpRequest> findByIdAddress(UUID idAddress);
	List<HelpRequest> findByIdCommentOrder (UUID idCommentOrder);
	List<HelpRequest> findByIdUserHelper(UUID idUserHelper);
	List<HelpRequest> findByIdHelpRequestStatus (UUID idHelpRequestStatus);


}
