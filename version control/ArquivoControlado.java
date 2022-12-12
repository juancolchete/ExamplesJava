
public class ArquivoControlado extends Arquivo{
	boolean modificado;
	ArquivoControlado(String nome,String conteudo){
		super(nome,conteudo);
	}
	public void adicionaConteudo(String conteudo) {
		this.modificado = true;
		this.conteudo = conteudo;
	}
}
