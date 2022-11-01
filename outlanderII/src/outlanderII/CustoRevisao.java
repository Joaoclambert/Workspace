package outlanderII;

public class CustoRevisao {

	double kmAnual = 10200.00;
	double priceGasolina = 5.09;
	double priceDiesel = 6.99;
	double kmPorLitroGas = 8.20;
	double kmPorLitroDiesel = 13.00;
	double baseGasolina = 1260.00;
	double baseDiesel = 1620.00;


	double revisaoGasolina() {		
		return baseGasolina + (kmAnual / kmPorLitroGas) * priceGasolina;
	}

	double revisaoDiesel() {
		return baseDiesel + (kmAnual / kmPorLitroDiesel) * priceDiesel;
	}
	
	

}
