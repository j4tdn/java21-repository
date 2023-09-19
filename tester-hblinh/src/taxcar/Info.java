package taxcar;

public class Info {
	//attribute
	private String name;
	private String type;
	private double capacity;
	private double value;
	public Info() {

	}
	
	//constructor by full param
	public Info(String name, String type, double capacity, double value) {
		
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.value = value;
	}
	
	// set get value
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
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	// toString

	@Override
	public String toString() {
		return "Info [name=" + name + ", type=" + type + ", capacity=" + capacity + ", value=" + value + "]";
	}
	
	
}
