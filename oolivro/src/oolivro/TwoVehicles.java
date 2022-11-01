package oolivro;

public class TwoVehicles {
	
	public static void main(String args[]) {
	
	Vehicle minivan = new Vehicle(7, 16, 21);
	Vehicle sportcar = new Vehicle(2, 14, 12);
	double gallons;
	int dist = 252;
	
		

	
	gallons = minivan.fuelneeded(dist);
	System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");
	gallons = sportcar.fuelneeded(dist);
	System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel");
	
		
	System.out.println("Minivan can carry " + minivan.passengers + " with range of "+
	minivan.range() + " Miles");
	System.out.println("Sportcar can carry " + sportcar.passengers + " with range of " + 
	sportcar.range() + " Miles");
	
	
	if(minivan.range() > sportcar.range()) System.out.println("Mpg minivan has greater range");
			
	}
	}
	
	
	


