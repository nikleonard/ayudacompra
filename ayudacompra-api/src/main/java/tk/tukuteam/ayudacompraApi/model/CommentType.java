package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idCommentType;
	private String commentTypeName;
	
	public UUID getIdCommentType() {
		return idCommentType;
	}
	public void setIdCommentType(UUID idCommentType) {
		this.idCommentType = idCommentType;
	}
	public String getCommentTypeName() {
		return commentTypeName;
	}
	public void setCommentTypeName(String commentTypeName) {
		this.commentTypeName = commentTypeName;
	}
}
