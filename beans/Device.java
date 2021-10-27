public class Device {
	int id;
	String name;
	String type;
	int plan_id;
	
	public Device() {
		super();
	}

	public Device(int id, String name, String type, int plan_id) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.plan_id = plan_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", type=" + type + ", plan_id=" + plan_id + "]";
	}
	
	

}
