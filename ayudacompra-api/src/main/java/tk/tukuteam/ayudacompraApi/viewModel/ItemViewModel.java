package tk.tukuteam.ayudacompraApi.viewModel;

import java.io.Serializable;

public class ItemViewModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Id;
	private String Name;
	private String Quantity;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
}
