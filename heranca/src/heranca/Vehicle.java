package heranca;

public class Vehicle {
	
	protected  String brand = "Ford";				//Veiculo atributo
	public void honk() {						//Veículo metodo
		System.out.println("Tuuuut...Tuutu");
	}
}
	

		class Car extends Vehicle{
		private String modelName = "Mustang";      //Car atributo
		public static void main(String[] args) {
			Car myCar = new Car();                 //Cria objeto
			myCar.honk();                          //Chama o metodo honk da classe Veículo no obj. myCar
			System.out.println(myCar.brand + " " + myCar.modelName);  //Exibe o valor do atributo brand (da classe Vehicle) e o valor do modelName da classe Car
		}
	
}