package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Warning {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idWarning;
	private UUID idWarningType;
	private UUID idUserFrom;
	private UUID idUserTo;
	private UUID idTextComments;
	private UUID idHelpRequest;
	private UUID idAddressNeedy;
	
	public UUID getIdWarning() {
		return idWarning;
	}
	public void setIdWarning(UUID idWarning) {
		this.idWarning = idWarning;
	}
	public UUID getIdWarningType() {
		return idWarningType;
	}
	public void setIdWarningType(UUID idWarningType) {
		this.idWarningType = idWarningType;
	}
	public UUID getIdUserFrom() {
		return idUserFrom;
	}
	public void setIdUserFrom(UUID idUserFrom) {
		this.idUserFrom = idUserFrom;
	}
	public UUID getIdUserTo() {
		return idUserTo;
	}
	public void setIdUserTo(UUID idUserTo) {
		this.idUserTo = idUserTo;
	}
	public UUID getIdTextComments() {
		return idTextComments;
	}
	public void setIdTextComments(UUID idTextComments) {
		this.idTextComments = idTextComments;
	}
	public UUID getIdHelpRequest() {
		return idHelpRequest;
	}
	public void setIdHelpRequest(UUID idHelpRequest) {
		this.idHelpRequest = idHelpRequest;
	}
	public UUID getIdAddressNeedy() {
		return idAddressNeedy;
	}
	public void setIdAddressNeedy(UUID idAddressNeedy) {
		this.idAddressNeedy = idAddressNeedy;
	}
}
