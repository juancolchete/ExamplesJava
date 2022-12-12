import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reuniao {
	public static List<Reuniao> reunioes = new ArrayList<Reuniao>();
	
	int id;
	int dia, mes, ano, hora, min, qdtd_pessoas;
	
	public static boolean podeInserir(int identifier) {
		boolean podeInserir = true;
		for(int i = 0; i < reunioes.size(); i++) {
			Reuniao reuniaoObj = reunioes.get(i);
			if(reunioes.get(i).id == identifier) {
				return podeInserir = false;
			}
		}
		return podeInserir;
	}
	
	public static void inserirReuniao(String data) {
		String linha[] = new String[7];
		String tempLine =  data;
		if(data.indexOf(" I ") > 0) {
			tempLine = tempLine.replace("I ","");
		}
		linha = tempLine.split(" ");
		Reuniao reuniaoObj = new Reuniao();
		int id = Integer.parseInt(linha[0]);
		if(podeInserir(id)) {
			
			reuniaoObj.id = id;
			reuniaoObj.dia = Integer.parseInt(linha[1]);
			reuniaoObj.mes = Integer.parseInt(linha[2]);
			reuniaoObj.ano = Integer.parseInt(linha[3]);
			reuniaoObj.hora = Integer.parseInt(linha[4]);
			reuniaoObj.min = Integer.parseInt(linha[5]);
			reuniaoObj.qdtd_pessoas = Integer.parseInt(linha[6]);
			
			reunioes.add(reuniaoObj);
			
			reunioes.sort(Comparator.comparing(Reuniao::getId));
		}else {
			System.out.println(data);
		}
		
	}

	public int getId() {
		return id;
	}
	
	public static void salvarTodasReunioes(String nomeBaseDados) throws IOException {
		
		File fout = new File("atual-"+nomeBaseDados+".txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		
		
		String todasReunioes = "";
		for(int i = 0; i < reunioes.size(); i++) {
			
			Reuniao reuniaoObj = reunioes.get(i);
			todasReunioes = reuniaoObj.id+" "+reuniaoObj.dia+" "+reuniaoObj.mes+" "+reuniaoObj.ano+" "+reuniaoObj.hora+" "+reuniaoObj.min+" "+reuniaoObj.qdtd_pessoas;
			bw.write(todasReunioes);
			bw.newLine();
		}
		bw.close();
		
	}
	
	public static void modificarReuniao(String data) {
		String linha[] = new String[4];
		boolean modificado = false;
		linha = data.split(" ");
		int identifier = Integer.parseInt(linha[0]);
		for(int i = 0; i < reunioes.size(); i++) {
			Reuniao reuniaoObj = reunioes.get(i);
			if(reunioes.get(i).id == identifier) {
				modificado = true;
				if(linha[2].toUpperCase().equals("DIA"))
				{
					reuniaoObj.dia = Integer.parseInt(linha[3]);
				}
				else if(linha[2].toUpperCase().equals("MES")) 
				{
					reuniaoObj.mes = Integer.parseInt(linha[3]);
				}
				else if(linha[2].toUpperCase().equals("ANO")) 
				{
					reuniaoObj.ano = Integer.parseInt(linha[3]);
				}
				else if(linha[2].toUpperCase().equals("HORA")) 
				{
					reuniaoObj.hora = Integer.parseInt(linha[3]);
				}
				else if(linha[2].toUpperCase().equals("MIN")) 
				{
					reuniaoObj.min = Integer.parseInt(linha[3]);
				}
				else if(linha[2].toUpperCase().equals("QTD")) {
					reuniaoObj.qdtd_pessoas = Integer.parseInt(linha[3]);
				}
				reunioes.set(i, reuniaoObj);
			}
		}
		if(!modificado) {
			System.out.println(data);
		}
	}
	
	public static void apagarReuniao(String data) {
		String linha[] = new String[2];
		boolean apagado = false;
		linha = data.split(" ");
		int identifier = Integer.parseInt(linha[0]);
		for(int i = 0; i < reunioes.size(); i++) {
			Reuniao reuniaoObj = reunioes.get(i);
			if(reunioes.get(i).id == identifier) {
				apagado = true;
				reunioes.remove(i);
			}
		}
		if(!apagado) {
			System.out.println(data);
		}
	}
}
