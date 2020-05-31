package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.CommentType;

public interface CommentTypeRepository extends CrudRepository<CommentType, UUID>{
	List<CommentType> findByCommentTypeName(String commentTypeName);
}
