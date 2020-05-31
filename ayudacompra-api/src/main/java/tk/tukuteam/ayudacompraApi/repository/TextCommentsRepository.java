package tk.tukuteam.ayudacompraApi.repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import tk.tukuteam.ayudacompraApi.model.TextComments;

public interface TextCommentsRepository extends CrudRepository<TextComments, UUID> {
	
	List<TextComments> findByIdCommentType(UUID idCommentType);
	List<TextComments> findByContentComment(String ContentComent);

}
