package ctis221project;

import java.util.Scanner;

public abstract class Organization {
	protected int id;
	protected String name;
	protected String type;
	protected String place;
	protected double price; 
	protected int quota;
	
	
	public Organization(int id, String name, String type, String place, double price, int quota) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.price = price;
		this.quota = quota;
	}
	
	public Organization() {
		
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getPlace() {
		return place;
	}
	public double getPrice() {
		return price;
	}
	public int getQuota() {
		return quota;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	
	public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unique id :");
        id = sc.nextInt();
        System.out.print("Enter the name of Organization: ");
        name = sc.next();
        System.out.println("Enter the place: ");
        place = sc.next();
        System.out.println("Enter the price: ");
        price = sc.nextDouble();
        System.out.println("Enter the quota: ");
        quota = sc.nextInt();
    }
	
	public abstract double getSale();
	@Override
	public String toString() {
		return "Organization "
				+ "\nid=" + id + 
				"\nname=" + name + 
				"\ntype=" + type + 
				"\nplace=" + place + 
				"\nprice=" + price + 
				"\nquota=" + quota;
	}
	
	
}
