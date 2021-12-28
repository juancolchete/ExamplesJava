public class Amonia extends SubstanciaPura{
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= -33.34) {
			System.out.println("Entrou em ebuli��o");
		}
	}
	public void entrarPontoDeFusao(double temp) {
		if(temp >= -77.73) {
			System.out.println("Entrou em fus�o");
		}
	}
}