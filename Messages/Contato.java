import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contato {
	String nome;
	int contador;
	boolean primeira;
	List<Mensagem> mensagens = new ArrayList<Mensagem>();
	Contato(String nome){
		this.nome = nome;
		primeira = true;
	}
	void enviaMensagem(Contato destinatario,String conteudo){
		if(primeira) {
			this.contador = 1;
			this.primeira = false;
		}
		String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println("Mensagens de "+this.nome+":");
		System.out.println("Mensagem "+contador+": ");
		System.out.println(this.nome+"->"+destinatario.nome);
		System.out.println(data);
		System.out.println(conteudo);
		System.out.println();
		Mensagem mensagem = new Mensagem(conteudo,data,this,destinatario);
		this.contador++;
	}
	void enviaMensagem(Grupo grupo,String conteudo){
		
		if(this.perteceGrupo(grupo)) {
			if(primeira) {
				this.contador = 1;
				this.primeira = false;
			}
			String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
			System.out.println("Mensagens de "+this.nome+":");
			System.out.println("Mensagens de "+grupo.nome+":");
			System.out.println("Mensagem "+contador+": ");
			System.out.println(this.nome+"->"+grupo.nome);
			System.out.println(data);
			System.out.println(conteudo);
			System.out.println();
			Mensagem mensagem = new Mensagem(conteudo,data,this,grupo);
			this.contador++;
		}else {
			System.out.println(this.nome+" não faz parte do grupo "+grupo.nome+" !!!");
			System.out.println();
		}
	}
	boolean perteceGrupo( Grupo grupo) {
		int i = -1;
		Contato contatoGrupo;
		Contato contato = this;
		if (grupo.contatos.size() > 0) {
			do {
				i++;
				contatoGrupo = grupo.contatos.get(i);
				if (contato.nome == contatoGrupo.nome) {
					return true;
				}
			} while (contato.nome != contatoGrupo.nome && i < grupo.contatos.size() - 1);
		}
		return false;
	}
}
