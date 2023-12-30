package bean;

import java.util.Objects;

public class Trader {
	private String name;
	private String city;
	
	public Trader() {
	}
	
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getName());
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Trader)) {
			return false;
		}
		Trader that = (Trader)o;
		return this.getName().equals(that.getName());
	}

}
