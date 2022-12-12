import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.util.Formatter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Arquivo {
	public static void lerTexto(String nomeArquivo){
	    try {
	      File obj = new File(nomeArquivo);
	      Scanner Leitor = new Scanner(obj);
	      while (Leitor.hasNextLine()) {
	        String data = Leitor.nextLine();
	        if(data.indexOf(" I ") > 0 || data.indexOf(" M ") > 0 || data.indexOf(" E") > 0 ) {
	        	Correcoes.tratarOperacao(data);
	        }else {
	        	Reuniao.inserirReuniao(data);
	        }
	      }
	      Leitor.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Houve um erro na leitura do arquivo");
	      e.printStackTrace();
	    }
	  }
	public static void salvarTexto(String nomeBaseDados,String conteudo) {
		String nomeArquivo = "atual-"+nomeBaseDados+".txt";
		Path file = Paths.get(nomeArquivo);
		try {
			Formatter saida = new Formatter(nomeArquivo);
			saida.close();
			Files.write(file, conteudo.getBytes(), StandardOpenOption.WRITE);
		} catch (IOException e) {
			System.out.println("Problemas na escrita do arquivo!");
			e.printStackTrace();
		}
	}
}
