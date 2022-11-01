package polimorfismo;

	class Animal {
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
	}
	class Pig extends Animal{
		public void animalSound() {
			System.out.println("The pig says: wee wee");
		}
	}
	class Dog extends Animal{
		public void animalSound() {
			System.out.println("The dog says: bow wow");
		}
	}
	
	class Main{
		public static void main (String[] args) {
			
			Animal myAnimal = new Animal(); //cria objeto
			Animal myPig = new Pig();	//cria objeto
			Animal myDog = new Dog();	//cria objeto
			
			myAnimal.animalSound();
			myPig.animalSound();
			myDog.animalSound();
			
		}
	}
	
	
	
	


