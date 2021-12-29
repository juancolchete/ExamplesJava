import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
	String conteudo;
	String data;
	Contato remetente;
	Contato destinatario;
	Grupo grupoRemetente;
	Grupo grupoDestinatario;
	
	Mensagem(String conteudo, String data,Contato remetente,Contato destinatario){
		this.conteudo = conteudo;
		this.data = data;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}
	Mensagem(String conteudo, String data,Contato remetente,Grupo destinatario){
		this.conteudo = conteudo;
		this.data = data;
		this.remetente = remetente;
		this.grupoDestinatario = destinatario;
	}
}
