package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WarningType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idWarningType;
	private String warningTypeName;
	
	public UUID getIdWarningType() {
		return idWarningType;
	}
	public void setIdWarningType(UUID idWarningType) {
		this.idWarningType = idWarningType;
	}
	public String getWarningTypeName() {
		return warningTypeName;
	}
	public void setWarningTypeName(String warningTypeName) {
		this.warningTypeName = warningTypeName;
	}
	
	


}
