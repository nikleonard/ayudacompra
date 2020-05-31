package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.WarningType;

public interface WarningTypeRepository extends CrudRepository<WarningType, UUID>{
	List<WarningType> findByWarningTypeName(String warningTypeName);

}
