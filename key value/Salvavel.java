import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class Salvavel {
	public static void salvar(String nomeArquivo, String conteudo) {
		Path file = Paths.get(nomeArquivo);
		try {
		Files.write(file, conteudo.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("Problemas na escrita do arquivo!");
			e.printStackTrace();
		}
	}
}