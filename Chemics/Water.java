public class Agua extends SubstanciaPura{
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= 100) {
			System.out.println("Entrou em ebuli��o");
		}
	}
	public void entrarPontoDeFusao(double temp) {
		if(temp >= 0) {
			System.out.println("Entrou em fus�o");
		}
	}
}
