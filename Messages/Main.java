
public class Main {

	public static void main(String[] args) {
		Contato c1 = new Contato("Fulano");
		Contato c2 = new Contato("Ciclano");
		Contato c3 = new Contato("Beltrano");
		Grupo amigos = new Grupo("Friendship");
		amigos.adicionaContato(c1);
		amigos.adicionaContato(c2);
		c3.enviaMensagem(amigos,"Hi friends!");		
		c1.enviaMensagem(amigos,"Hello evoryone!");
		c1.enviaMensagem(c2,"Good morning!");
		c1.enviaMensagem(amigos,"Hello everyone!");
	}

}
