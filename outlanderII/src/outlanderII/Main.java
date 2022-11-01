package outlanderII;

public class Main {
	
	
	public static void main(String[] args) {
		CustoRevisao outlanderGasolina = new CustoRevisao();
		CustoRevisao outlanderDiesel = new CustoRevisao();
		
				
		 System.out.printf("O custo anual a gasolina é: R$ %.2f\n" ,outlanderGasolina.revisaoGasolina());
		 System.out.printf("O custo anual a diesel é: R$ %.2f " ,outlanderDiesel.revisaoDiesel());
		}
		

}
