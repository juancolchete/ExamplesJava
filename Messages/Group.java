import java.util.ArrayList;
import java.util.List;

public class Grupo {
	String nome;
	List<Contato> contatos = new ArrayList<Contato>();
	
	Grupo(String nome){
		this.nome = nome;
	}
	
	void adicionaContato(Contato contato) {
		contatos.add(contato);
	}
	
}
