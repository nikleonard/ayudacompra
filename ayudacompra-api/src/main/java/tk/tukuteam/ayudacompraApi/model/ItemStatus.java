package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idItemStatus;
	private String itemStatusName;
	public UUID getIdItemStatus() {
		return idItemStatus;
	}
	public void setIdItemStatus(UUID idItemStatus) {
		this.idItemStatus = idItemStatus;
	}
	public String getItemStatusName() {
		return itemStatusName;
	}
	public void setItemStatusName(String itemStatusName) {
		this.itemStatusName = itemStatusName;
	}
	
	
}
