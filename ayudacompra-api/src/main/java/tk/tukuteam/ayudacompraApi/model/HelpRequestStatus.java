package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HelpRequestStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private UUID idHelpRequestStatus;
	private String helpRequestStatusName;
	
	public UUID getIdHelpRequestStatus() {
		return idHelpRequestStatus;
	}
	public void setIdHelpRequestStatus(UUID idHelpRequestStatus) {
		this.idHelpRequestStatus = idHelpRequestStatus;
	}
	public String getHelpRequestStatusName() {
		return helpRequestStatusName;
	}
	public void setHelpRequestStatusName(String helpRequestStatusName) {
		this.helpRequestStatusName = helpRequestStatusName;
	}
	
	
	

	

}
