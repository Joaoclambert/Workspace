package testebook;

public class LoanDetails {
	
	private double term;
	private double rate;
	private double principal;
	
	
	public LoanDetails() {
		term = 180;
		rate = 0.0265;		// taxa
		principal = 0;		
	}
													// EXERCICIO LIVRO  PAG: 195
	public void setPrincipal(double p) {
		principal = p;
	}
	
	public void getTerm() {
		return;
	}
	
	public double monthlyPayment() {
	return (rate * principal / 12) / (1.0 - Math.pow((rate/12 + 1.0), (- term)));
}
	public double Taxa() {
		return ((rate * principal / 12) / (1.0 - Math.pow((rate/12 + 1.0), (- term)))*term)-principal;
	}
	public double TotalValue() {
		return ((rate * principal / 12) / (1.0 - Math.pow((rate/12 + 1.0), (- term)))*term);
	}

}

class Value{
	
	public static void main(String[] args) {
		LoanDetails id = new LoanDetails();
		
		id.setPrincipal(150000);
		id.getTerm();
		id.Taxa();
		id.TotalValue();
		System.out.println("Month payment: " + id.monthlyPayment() + "\nTotal value: " + id.TotalValue() + "\nTaxa value: " + id.Taxa());
		
	
	
	}	
	
}
	
