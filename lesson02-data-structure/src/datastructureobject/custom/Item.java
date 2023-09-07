package datastructureobject.custom;

public class Item {
	int id;
	char name;
	double price;
	
	public Item() {
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ this.id + ","+this.name +","+this.price+"]";		
	}
	
	public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

};






