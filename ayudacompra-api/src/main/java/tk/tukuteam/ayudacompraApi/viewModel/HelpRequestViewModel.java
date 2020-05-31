package tk.tukuteam.ayudacompraApi.viewModel;

import java.io.Serializable;

public class HelpRequestViewModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
    private String avatar;
    private String address;
    public void setName(String name) {
        this.name = name;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAvatar() {
        return avatar;
    }
    public String getAddress() {
        return address;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
}
