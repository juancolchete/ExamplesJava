import java.util.ArrayList;
import java.util.List;

public class ControlZ {
	Diretorio pastaProjeto;
	int ultimaVersao;
	int oldUltimaVersao;
	boolean precisaSalvar = true;
	boolean primeiraVez = true;
	int ultimoIdentificador;
	int ultimoArquivoAlterado;
	int naoSalvoCount;
	public static List<Versao> versoes = new ArrayList<Versao>();
	ControlZ(Diretorio pastaProjeto){
		this.pastaProjeto = pastaProjeto;
		this.ultimaVersao = -1;
		this.oldUltimaVersao = -1;
	}
	
	public void estado() {
		if(ultimaVersao > -1) {
		int quantidadeArquivos = versoes.get(ultimaVersao).diretorio.arquivos.size();
		for(int i = 0; i < quantidadeArquivos; i++) {
			if(versoes.get(ultimaVersao).diretorio.arquivos.get(i).modificado) {
				naoSalvoCount++;
			}
		}
		if(versoes.get(ultimaVersao) != null  && naoSalvoCount < 2) {
			
			ultimoIdentificador = versoes.get(ultimaVersao).identificador;
				System.out.println("Versao: "+versoes.get(ultimaVersao).identificador);
				String estado;
				for(int i = 0; i < quantidadeArquivos; i++) {
					if(versoes.get(ultimaVersao).diretorio.arquivos.get(i).modificado) {
						estado = "Não salvo";
						precisaSalvar = true;
					}else {
						estado = "Salvo";
					}
					System.out.println(versoes.get(ultimaVersao).diretorio.arquivos.get(i).nome+" - "+estado);
				}
				System.out.println();
		}
		}
	}
	
	public void confirma() {
		if(ultimaVersao < oldUltimaVersao) {
			ultimaVersao = oldUltimaVersao;
		}
		if(precisaSalvar) {
			ultimaVersao++;
			oldUltimaVersao = ultimaVersao;
			Versao versao = new Versao(ultimaVersao,pastaProjeto);
			versoes.add(versao);
			
			int quantidadeArquivos = versoes.get(ultimaVersao).diretorio.arquivos.size();
			for(int i = 0; i < quantidadeArquivos; i++) {
				if(versoes.get(ultimaVersao).diretorio.arquivos.get(i).modificado) {
					naoSalvoCount= 0;
					versoes.get(ultimaVersao).diretorio.arquivos.get(i).modificado = false;
					ultimoArquivoAlterado = i;
				}
			}
		}
	}
	
	public void retrocede() {

		ultimaVersao--;
		versoes.get(ultimaVersao).diretorio.arquivos.get(ultimoArquivoAlterado).modificado = true;
	}
}
