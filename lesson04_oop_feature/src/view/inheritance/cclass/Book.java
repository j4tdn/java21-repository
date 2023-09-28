package view.inheritance.cclass;

import java.math.BigDecimal;

public class Book {
	private String id;
	private String name;
	private BigDecimal salesPrice;
	private String publisher;
	public Book() {
		
	}
	public Book(String id, String name,BigDecimal salesPrice, String publisher) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return id+", "+name+","+publisher;
	}
	
}
