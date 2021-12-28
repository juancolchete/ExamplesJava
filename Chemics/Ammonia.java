public class Amonia extends SubstanciaPura{
	public void startBoilingPoint(double temp) {
		if(temp >= -33.34) {
			System.out.println("Entrou em ebuli��o");
		}
	}
	public void startFusionPoint(double temp) {
		if(temp >= -77.73) {
			System.out.println("Entrou em fus�o");
		}
	}
}