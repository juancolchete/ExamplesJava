public class Agua extends SubstanciaPura{
	public void startBoilingPoint(double temp) {
		if(temp >= 100) {
			System.out.println("Entrou em ebuli��o");
		}
	}
	public void startFusionPoint(double temp) {
		if(temp >= 0) {
			System.out.println("Entrou em fus�o");
		}
	}
}
