
abstract class Main {
	
	public String fname = "John";
	public int age = 24;
	public abstract void study();  // METODO ABSTRATO
	
	}
	class Student extends Main {
	
	public int graduationYear = 2018;
	public void study() {
		System.out.println("Studing all day long");
	}
	
	
	

}
