package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TextComments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idComments;
	private UUID idCommentType;
	private String contentComment;
	
	public UUID getIdComments() {
		return idComments;
	}
	public void setIdComments(UUID idComments) {
		this.idComments = idComments;
	}
	public UUID getIdCommentType() {
		return idCommentType;
	}
	public void setIdCommentType(UUID idCommentType) {
		this.idCommentType = idCommentType;
	}
	public String getContentComment() {
		return contentComment;
	}
	public void setContentComment(String contentComment) {
		this.contentComment = contentComment;
	}			
}
