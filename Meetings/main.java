import java.io.IOException;
public static void main(String[] args) throws IOException {
		Arquivo.lerTexto("base.txt");
		Arquivo.lerTexto("correcoes.txt");
		Reuniao.salvarTodasReunioes("Reuniao");
}
