package ctis221project;

import java.util.Scanner;

public class Party extends Organization{

	private String genre;
	private boolean adultOnly;
	
	public Party(String type, int id, String name, String place, double price, int quota, String genre,
			boolean adultOnly) {
		super(id, name, type, place, price, quota);
		this.genre = genre;
		this.adultOnly = adultOnly;
	}
	


	public String getGenre() {
		return genre;
	}

	public boolean isAdultOnly() {
		return adultOnly;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAdultOnly(boolean adultOnly) {
		this.adultOnly = adultOnly;
	}

	public void getInput()
    {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Genre: ");
        genre = sc.next();
        System.out.println("Are you under 18?(True/False)");
        adultOnly = sc.nextBoolean();
    }
	@Override
	public String toString() {
		return super.toString() + "Party "
				+ "\ngenre=" + genre + 
				"\nadultOnly=" + adultOnly;
	}

	@Override
	public double getSale() {
		// TODO Auto-generated method stub
		if(place.equalsIgnoreCase("Atakule Roof")) {
			return 50;
		}else
			return 10;
	}
	
	public void addVat()
    {
        price += price * 0.20;
    }
	
	
	
}
