import java.util.ArrayList;
import java.util.List;

public class Diretorio {
	public List<ArquivoControlado> arquivos = new ArrayList<ArquivoControlado>();
	
	Diretorio(){
		System.out.println("Ainda n�o h� vers�o salva!");
	}
	
	public void adicionaArquivo(ArquivoControlado arquivoControlado) {
		arquivos.add(arquivoControlado);
	}
}
