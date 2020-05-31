package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private UUID idItems;
	private int quantity;
	private String itemName;
	private UUID idItemStatus;
	private UUID idHelpRequest;
	
	public UUID getIdItems() {
		return idItems;
	}
	public void setIdItems(UUID idItems) {
		this.idItems = idItems;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public UUID getIdItemStatus() {
		return idItemStatus;
	}
	public void setIdItemStatus(UUID idItemStatus) {
		this.idItemStatus = idItemStatus;
	}
	public UUID getIdHelpRequest() {
		return idHelpRequest;
	}
	public void setIdHelpRequest(UUID idHelpRequest) {
		this.idHelpRequest = idHelpRequest;
	}
	
	
	
	

}
