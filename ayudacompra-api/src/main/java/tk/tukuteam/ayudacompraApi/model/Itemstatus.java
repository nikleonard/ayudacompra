package tk.tukuteam.ayudacompraApi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Itemstatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id_item_status;
	private String item_status_name;
	
	public UUID getId_item_status() {
		return id_item_status;
	}
	public void setId_item_status(UUID id_item_status) {
		this.id_item_status = id_item_status;
	}
	public String getItem_status_name() {
		return item_status_name;
	}
	public void setItem_status_name(String item_status_name) {
		this.item_status_name = item_status_name;
	}
	
	
	
	


}
