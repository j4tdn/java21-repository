package ex2;

public class Vehicle {
	private String ownerName;
	
	private String typeOfVehicle;
	
	private int cc;
	
	private double cost;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String typeOfVehicle, int cc, double cost) {
		super();
		this.ownerName = ownerName;
		this.typeOfVehicle = typeOfVehicle;
		this.cc = cc;
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
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

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", typeOfVehicle=" + typeOfVehicle + ", cc=" + cc + ", cost=" + cost;
	}
}
