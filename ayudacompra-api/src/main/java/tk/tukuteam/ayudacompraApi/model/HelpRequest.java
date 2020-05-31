package tk.tukuteam.ayudacompraApi.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HelpRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private UUID idHelpRequest;
	private String title;
	private Date dateCreated;
	private Date dateExpiration;
	private Date dateCompleted;
	private UUID idUserNeedy;
	private UUID idAddress;
	private UUID idCommentOrder;
	private UUID idUserHelper;
	private UUID idHelpRequestStatus;
	
	public UUID getIdHelpRequest() {
		return idHelpRequest;
	}
	public void setIdHelpRequest(UUID idHelpRequest) {
		this.idHelpRequest = idHelpRequest;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public Date getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	public UUID getIdUserNeedy() {
		return idUserNeedy;
	}
	public void setIdUserNeedy(UUID idUserNeedy) {
		this.idUserNeedy = idUserNeedy;
	}
	public UUID getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(UUID idAddress) {
		this.idAddress = idAddress;
	}
	public UUID getIdCommentOrder() {
		return idCommentOrder;
	}
	public void setIdCommentOrder(UUID idCommentOrder) {
		this.idCommentOrder = idCommentOrder;
	}
	public UUID getIdUserHelper() {
		return idUserHelper;
	}
	public void setIdUserHelper(UUID idUserHelper) {
		this.idUserHelper = idUserHelper;
	}
	public UUID getIdHelpRequestStatus() {
		return idHelpRequestStatus;
	}
	public void setIdHelpRequestStatus(UUID idHelpRequestStatus) {
		this.idHelpRequestStatus = idHelpRequestStatus;
	}
	
	
	


}
