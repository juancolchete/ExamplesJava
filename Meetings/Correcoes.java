
public class Correcoes {
	public static void tratarOperacao(String linha) {
		if(linha.indexOf(" I ") > 0) {
			Reuniao.inserirReuniao(linha);
		}else if(linha.indexOf(" M ") > 0){	
			Reuniao.modificarReuniao(linha);
		}else if(linha.indexOf(" E") > 0) {
			Reuniao.apagarReuniao(linha);
		}
	}
}
