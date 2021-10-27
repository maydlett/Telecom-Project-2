public class Plan {
	String name;
	String price;
	String line;
	int customer_id;
	
	public Plan() {
		super();
	}

	public Plan(String name, String price, String line, int customer_id) {
		super();
		this.name = name;
		this.price = price;
		this.line = line;
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Plan [name=" + name + ", price=" + price + ", line=" + line + ", customer_id=" + customer_id + "]";
	}
	

}
