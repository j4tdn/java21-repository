package ex02dangkimuaxe;

public class Vehicle {
	private String host;
	private String model;
	private double capicity;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String host, String model, double capicity, double price) {
		this.host = host;
		this.model = model;
		this.capicity = capicity;
		this.price = price;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapicity() {
		return capicity;
	}

	public void setCapicity(double capicity) {
		this.capicity = capicity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double tax() {
		double taxPay = 0;
		if(this.capicity < 100) {
			taxPay = this.price * 0.01;
		} else if (this.capicity < 200) {
			taxPay = this.price * 0.03;
		} else {
			taxPay = this.price * 0.05;
		}
		return taxPay;
	}

	@Override
	public String toString() {
		return "Vehicle [host=" + host + ", model=" + model + ", capicity=" + capicity + ", price=" + price + ", Tax= " + tax() + "]";
	}

	

}
