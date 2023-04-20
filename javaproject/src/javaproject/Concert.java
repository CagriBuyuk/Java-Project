package ctis221project;

import java.util.Scanner;

public class Concert extends Organization{

	private String musician;

	public Concert(int id, String name, String type, String place, double price, int quota, String musician) {
		super(id, name, type, place, price, quota);
		this.musician = musician;
	}
	
	public Concert() {
		
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}

	public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        super.getInput();
        System.out.print("Enter Musician Name: ");
        musician = sc.next();
    }
	@Override
	public String toString() {
		return super.toString() + "Concert \nmusician=" + musician;
	}

	@Override
	public double getSale() {
		// TODO Auto-generated method stub
		if(place.equalsIgnoreCase("Volkwagen Arena")) {
			return 70;
		}else
			return 20;
	}

	public void addVat()
    {
        price += price * 0.20;
    }

}
