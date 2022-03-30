package lab2;

public class Item {
	private String itemName ;
	private String itemidNo ;
	private int itemQuantity;
	private double itemPrice;
	
	public Item(String name , String idno , int q , double prc) {
		this.itemName = name;
		this.itemidNo = idno;
		this.itemQuantity = q;
		this.itemPrice = prc;
	}
	
	public Item(String name , String idno , int q ) {
		this.itemName = name;
		this.itemidNo = idno;
		this.itemQuantity = q;
		this.itemPrice = 500;
	}
	
	public Item(String name , String idno) {
		this.itemName = name;
		this.itemidNo = idno;
		this.itemQuantity = 1;
		this.itemPrice = 500;
	}
	
	public String retrieveItemName() {
		return this.itemName;
	}
	
	public void setItemName(String name) {
		this.itemName = name;
	}
	
	public String retrieveIDNo() {
		return this.itemidNo;
	}
	
	public void setIDNo(String idno) {
		this.itemidNo = idno;
	}
	
	public int getItemQuantity() {
		return this.itemQuantity;
	}
	
	public void setItemQuantity(int q) {
		this.itemQuantity = q;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	public void setItemPrice(double price) {
		this.itemPrice = price;
	}
}
