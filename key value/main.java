import java.time.*;


public static void main(String[] args) {
    Dicionario palavras = new Dicionario();
    palavras.setValor(new Chave("autor"), new Valor("Coord. Disciplina"));
    palavras.setValor(new Chave("alias"), palavras.getValor(new Chave("autor")));
    palavras.setValor(new Chave("data-atual"), new Valor(LocalDate.now()));
    palavras.setValor(new Chave("hora-atual"), new Valor(LocalTime.now()));
    palavras.setValor(new Chave("discilina"), new Valor("POO"));
    LocalDate data_ad1 = LocalDate.of(2021, 8, 16);
    palavras.setValor(new Chave(data_ad1), new Valor("Lançar AD1 na plataforma"));
    palavras.delValor(new Chave("alias"));
    System.out.println(palavras.listar());
    System.out.println(palavras.toJson());
    Dicionario.salvar("teste.txt", palavras.toJson());
}