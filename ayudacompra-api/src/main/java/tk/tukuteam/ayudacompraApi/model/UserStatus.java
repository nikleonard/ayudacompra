package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idUserStatus;
	private String userStatusName;
	public UUID getIdUserStatus() {
		return idUserStatus;
	}
	public void setIdUserStatus(UUID idUserStatus) {
		this.idUserStatus = idUserStatus;
	}
	public String getUserStatusName() {
		return userStatusName;
	}
	public void setUserStatusName(String userStatusName) {
		this.userStatusName = userStatusName;
	}
	
	
}
