package bean;

public class Vehicle {

    private String ownerName;
    private String branch;
    private int engineCapacity; // dung tích xylanh(cc)
    private long vehiclePrice;

    public Vehicle() {
    }

    public Vehicle(String ownerName, String branch, int engineCapacity, long vehiclePrice) {
        super();
        this.ownerName = ownerName;
        this.branch = branch;
        this.engineCapacity = engineCapacity;
        this.vehiclePrice = vehiclePrice;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public long getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(long vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    
    

    @Override
    public String toString() {
        return "Vehicle{" + "ownerName=" + ownerName + ", branch=" + branch + ", engineCapacity=" + engineCapacity + ", vehiclePrice=" + vehiclePrice + '}';
    }

//    public double calculateTax() {
//        if (engineCapacity < 100) {
//            return vehiclePrice * 0.01;
//        } else if (engineCapacity >= 100 && engineCapacity <= 200) {
//            return vehiclePrice * 0.03;
//        } else {
//            return vehiclePrice * 0.05;
//        }
//    }
//
//    public void displayTax() {
//        System.out.print(ownerName + "\t\t");
//        System.out.print(branch + "\t\t");
//        System.out.print(engineCapacity + "\t\t");
//        System.out.print(vehiclePrice + "\t\t");
//        System.out.print(calculateTax() + "\n");
//    }
}
