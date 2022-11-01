package livroweb;


public class TwoDShape {
	
	//	double width; 	metodo nao privadp
	//	double height;  metodo nao privadp
		
		private double width;	// metodo privado
		private double height;	// metodo privado
		
		TwoDShape(){
			width = height = 0;
		}

		public TwoDShape(double w, double h) {
		
			width = w;
			height = h;
		}
		public TwoDShape(double x) {
			
			width = height = x;
		}

		public void setWidth(double w) {
			this.width = w;
		}

		public double getHeight() {					//METODO COMUM NAO USA  GET AND SET
			return height;
		}

		public void setHeight(double h) {
			this.height = h;
		}
		public double getWidth() {
			return width;
		}
	
		void showDim() {
			
			System.out.println("Width and height are: " + width + " and " + height);
		}
}

	class Triangle extends TwoDShape{
		private String style;
		
	
		public Triangle( String s, double w, double h) {
			super(w, h);
			style = s;
		
		}
		double area() {
			return getWidth() * getHeight()/2;
		}
		void showStyle() {
			System.out.println("Triangle is: " + style);
		}
		class Rectangle extends TwoDShape{
			boolean isSquare() {
				if(width == height) return true;
				return false;
			}
			double area() {
				return width * height;
			}
			
		}
		
		
	}

	class Shapes{
		
		public static void main(String[] args) {
			Triangle t1 = new Triangle("filled", 4.0, 4.0);
			Triangle t2 = new Triangle("outlined", 8.0, 12.0);
			
		//	t1.setWidth(4.0);				 // ALTERAÇAO  EXERC PAG 224  NORMAL SERIA = t1.width = 4.0;
		//	t1.setHeight(4.0);  			// ALTERAÇAO  EXERC PAG 224  NORMAL SERIA = t1.height = 4.0;	     
		//	t1.style = "filled";
			
		//	t2.setWidth(8.0);					// nao usa na terceira versao  pag 226
		//	t2.setHeight(12.0);
		//	t2.style = "outlined";
			
			System.out.println("Info for t1: ");
			t1.showStyle();
			t1.showDim();
			System.out.println("Area is: " + t1.area());
			
			System.out.println();
			
			System.out.println("Info for t2: ");
			t2.showStyle();
			t2.showDim();
			System.out.println("Area is: " + t2.area());					//	ate pg 230						
			
			
		}
	}
																				//vehicle pag 131
			
			
			
			
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	




	
	
	
	
	
	


