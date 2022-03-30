package lab2;

public class Customer {
	private String name ;
	private String idNo;
	private double Balance;
	private Item item;
	
	public void CreateCustomer(String nm , String id , double balance ) {
		this.name = nm;
		this.idNo = id;
		this.Balance = balance;
	}
	
	public void CreateCustomer(String nm , String id ) {
		this.name = nm;
		this.idNo = id;
		this.Balance = 5000;
	}
	
	public void setName( String nm) {
		this.name = nm;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setidNo( String id) {
		this.idNo = id;
	}
	
	public String getidNo() {
		return this.idNo;
	}
	
	public void setBalance(double bal) {
		this.Balance = bal;
	}
	
	public double getBalance() {
		return this.Balance;
	}
	
	public void print() {
		System.out.println("Item Name : "+ this.item.retrieveItemName());
		System.out.println("Item IDNo : "+ this.item.retrieveIDNo());
		System.out.println("Item Price :"+ this.item.getItemPrice());
		System.out.println("Item Quantity : "+ this.item.getItemQuantity());
		System.out.println("**********************************************");
	}
	
	public void buyItem(Item item) {
		if(item.getItemPrice()<=this.Balance && item.getItemQuantity()>=1) {
			this.item = item;
			this.Balance -= item.getItemPrice();
		}
		else {
			if(item.getItemPrice()>this.Balance)System.out.println("Insufficient balance");
			if(item.getItemQuantity()<1) System.out.println("Insufficient no of Items");
		}
	}
	
}
