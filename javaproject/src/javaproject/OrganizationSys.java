package ctis221project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class OrganizationSys {
	
	private static ArrayList<Organization> arr = new ArrayList<Organization>();
	
	//CHECKID
	public static boolean checkId(int id) {
		for (Organization o : arr)
			if (o.id == id) {
				return true;
			}
		return false;
	}

	public static Organization searchType(String Orgtype) {
		for (Organization o : arr)
			if (o.type.equalsIgnoreCase(Orgtype)) {
				return o;
			}
		return null;
	}
	
	public static String[] getTypes() {
        int i = 0;
        String[] types = new String[arr.size()];
        for (Organization o : arr) {
            types[i] = o.getType() + " ";
            i++;
        }

        return types;

    }
	public static int getArr() {
		return arr.size();
	}
	public static ArrayList<Organization> getArrL(){
		return arr;
	}


	public static boolean addOrganization(String Orgtype, int id, String name, String place, double price,int quota, String musician, double prize, String genre, boolean adultOnly) {
		Scanner sc = new Scanner(System.in);
       
        
		
		
	
		 
		 
		 
            if(Orgtype.equalsIgnoreCase("Party")){
            	
              return arr.add(new Party(Orgtype, id, name,  place,  price,  quota, genre, adultOnly) );
            }
            else if(Orgtype.equalsIgnoreCase("Competition")) {
            	
            return arr.add(new Competition( id,  name,  Orgtype,  place,  price,  quota, prize) );
            	 
            }else if(Orgtype.equalsIgnoreCase("Concert")) {
            	
            	 return arr.add(new Concert(id, name, Orgtype, place, price, quota, musician) );
            }
            else
            {
        return false;
            }
	}
	
	public static boolean removeOrganization(String name) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equalsIgnoreCase(name)) {
                arr.remove(i);
                return true;
            }
        }return false;
    }
	
	
	public static String displayHashSet() {//sorted by parcel no
        HashSet<Organization> ts = new HashSet();

        ts.addAll(arr);
        String res = "";
        for (Organization o : ts) {
            res += o.toString() + "\n";
        }
        return res;
    }

	public static String getAllOrganization() {
		String res = "";
        for (Organization o : arr) {
            res += o.toString();
        }
        return res;
    }
	
	public static String getSelectedOrganization(String type) {
        String res = "";

        switch (type) {
            case "Party":
                for (Organization o : arr) {
                    if (o instanceof Party) {
                        res += "Sale:"+o.getSale();
                        res += o.toString();
                    }
                }
                break;
            case "Competition":
                for (Organization o : arr) {
                    if (o instanceof Competition) {
                        res += "Sale:"+o.getSale();
                        res += o.toString();
                    }
                }
                break;
            case "Concert":
                for (Organization o : arr) {
                    if (o instanceof Concert) {
                        res += "Sale:"+o.getSale();
                        res += o.toString();
                    }
                }
                break;
        }
        return res;
    }
	
	public static Double calculateTotal() {
		double total=0;
		for(int i = 0;i<arr.size();i++) {
			total += (arr.get(i).getPrice())*(arr.get(i).getQuota());
		}return total;
		
	}
}
