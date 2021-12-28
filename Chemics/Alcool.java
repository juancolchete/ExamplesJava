package Questao2;

public class Alcool extends SubstanciaPura{
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= 78.4) {
			System.out.println("Entrou em ebulição");
		}
	}
	public void entrarPontoDeFusao(double temp) {
		if(temp >= 0) {
			System.out.println("Entrou em fusão");
		}
	}
}
