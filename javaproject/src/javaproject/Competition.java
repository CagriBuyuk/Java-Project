package ctis221project;

import java.util.Scanner;

public class Competition extends Organization{

	
	private double prize;
	
	public Competition(int id, String name, String type, String place, double price, int quota,
			double prize) {
		super(id, name, type, place, price, quota);
		this.prize = prize;
	}
	
	public Competition() {
	
	}

	public double getPrize() {
		return prize;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        super.getInput();
        System.out.println("Enter the prize for winners :");
        prize = sc.nextDouble();
    }
	@Override
	public String toString() {
		return super.toString() + "Competition "
				+ "\nname=" + name + 
				"\nprize=" + prize;
	}

	@Override
	public double getSale() {
		// TODO Auto-generated method stub
		if(place.equalsIgnoreCase("Bilkent Mayfest")) {
			return 30;
		}else
			return 10;
			
	}
	
	public void addVat()
    {
        price += price * 0.20;
    }
	
	
}
