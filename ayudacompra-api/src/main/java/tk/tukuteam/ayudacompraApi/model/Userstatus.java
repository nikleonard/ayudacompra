package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userstatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID iduserstatus;
	private String statusname;
	public UUID getIdUserStatus() {
		return iduserstatus;
	}
	public void setIdUserStatus(UUID idUserStatus) {
		this.iduserstatus = idUserStatus;
	}
	public String getStatusname() {
		return statusname;
	}
	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}
	
}
