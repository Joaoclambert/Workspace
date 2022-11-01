package power;

public class DemoPower {

	public static void main(String[] args) {
		Pwr x = new Pwr(4, 0);
		Pwr y = new Pwr(2, 5);
		Pwr z = new Pwr(5, 7);
	System.out.println(x.b + " Raised to the: "+ x.e + " power is " + x.get_pwr());
	System.out.println(y.b + " Raised to the: "+ y.e + " power is " + y.get_pwr());
	System.out.println(z.b + " Raised to the: "+ z.e + " power is " + z.get_pwr());
	}

}
