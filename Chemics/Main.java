public class Main {
	public static void main(String[] args) {
		SubstanciaPura objsubpura = new SubstanciaPura();
		objsubpura.entrarPontoDeEbulicao(100);
		objsubpura.entrarPontoDeFusao(100);
		
		Agua objagua = new Agua();
		objagua.entrarPontoDeEbulicao(100);
		objagua.entrarPontoDeFusao(0);
		objagua.entrarPontoDeEbulicao(99);
		objagua.entrarPontoDeFusao(-1);
		
		Amonia objamonia = new Amonia();
		objamonia.entrarPontoDeEbulicao(-33.34);
		objamonia.entrarPontoDeFusao(-77.73);
		objamonia.entrarPontoDeEbulicao(-33.35);
		objamonia.entrarPontoDeFusao(-77.74);
		
		Alcool objalcool = new Alcool();
		objalcool.entrarPontoDeEbulicao(78.4);
		objalcool.entrarPontoDeFusao(0);
		objalcool.entrarPontoDeEbulicao(78.3);
		objalcool.entrarPontoDeFusao(-1);
	}
}
