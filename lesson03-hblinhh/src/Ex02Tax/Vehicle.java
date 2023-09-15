package Ex02Tax;

public class Vehicle {
	  private double cap;
	  private String style;
	    private double value;
	    private String name;
	 
	    public Vehicle(String style, double cap, double value, String name) {
	        this.style = style;
	        this.cap = cap;
	        this.value = value;
	        this.name = name;
	       
	    }
	    public Vehicle(){
	
	    }
	    public String getStyle() {
	        return style;
	    }
	 
	    public void setStyle(String style) {
	        this.style = style;
	    }
	 
	    public double getCap() {
	        return cap;
	    }
	 
	    public void setCap(double cap) {
	        this.cap = cap;
	    }
	 
	    public double getValue() {
	        return value;
	    }
	 
	    public void setValue(double value) {
	        this.value = value;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	 
	    public double mathTax(){
	        double tax;
	        if(cap<100) tax=value*0.01;
	        else if (cap >= 100 && cap<=200) tax = value * 0.03;
	        else tax = value * 0.05;
	        return tax;
	    }
	 
	    @Override
	    public String toString() {
	        return name + "-" +style+ "-"+cap + "-"+value;
	}
	 
	    void prtTax(){
	        System.out.printf("%-15s%-20s%-15.2f%-15.2f%-15.2f\n",name,style,cap,value,mathTax());
	    }
	}

