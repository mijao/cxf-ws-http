package demo.order.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	
	private String customerID;
	private String itemID;
	private int qty;
	private double price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(String customerID, String itemID, int qty, double price) {		
		this.customerID = customerID;
		this.itemID = itemID;
		this.qty = qty;
		this.price = price;
	}	

	public String getCustomerID() {
		System.out.println("HOLA");
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}				
}