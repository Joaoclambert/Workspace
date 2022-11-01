package oolivro;

public class Vehicle {


		int passengers;
		int fuelcap;    // MODELO INICIAL
		int mpg;
		
	// VAI SER CRIADO UM CONSTRUTOR
		
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;  
		mpg = m;
		
	}
		
		int range() {
			return fuelcap * mpg;
		}
		
		double fuelneeded(int miles) {
			return (double) miles / mpg;
		}
		

	}


