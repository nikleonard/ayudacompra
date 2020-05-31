package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.HelpRequestStatus;

public interface HelpRequestStatusRepository extends CrudRepository<HelpRequestStatus, UUID> {
	List<HelpRequestStatus> findByHelpRequestStatusName(String helpRequestStatusName);

}
