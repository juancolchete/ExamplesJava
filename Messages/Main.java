
public class AP3_2021_1_Q2 {

	public static void main(String[] args) {
		Contato c1 = new Contato("Fulano");
		Contato c2 = new Contato("Ciclano");
		Contato c3 = new Contato("Beltrano");
		Grupo amigos = new Grupo("Amizade");
		amigos.adicionaContato(c1);
		amigos.adicionaContato(c2);
		c3.enviaMensagem(amigos,"Olá amigos!");		
		c1.enviaMensagem(amigos,"Olá a todos!");
		c1.enviaMensagem(c2,"Bom dia!");
		c1.enviaMensagem(amigos,"Olá a todos!");
	}

}
