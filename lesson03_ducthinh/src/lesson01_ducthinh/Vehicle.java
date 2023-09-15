package lesson01_ducthinh;

public class Vehicle {
	private String name;
	private String type;
	private int cc;
	private double cost;
	public Vehicle() {
		
	}
	public Vehicle(String name, String type, int cc, double cost) {
		super();
		this.name = name;
		this.type = type;
		this.cc = cc;
		this.cost = cost;
	}
	@Override
	public String toString() {
//		return "Vehicle [name=" + name + ", type=" + type + ", cc=" + cc + ", cost=" + cost + "]";
		return ""+name+"       "+type+"       "+cc+"          "+cost+"       ";
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
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double calTax() {
		double tax = 0;
		if(getCc()<100) {
			tax = 0.01*getCost();
		}else if(getCc()>=100 && getCc()<=200) {
			tax = 0.03*getCost();
		}else {
			tax = 0.05*getCost();
		}
		return tax;
	}
	
}

