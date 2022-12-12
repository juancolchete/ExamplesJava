import java.util.ArrayList;
import java.util.List;

public class Dicionario{
	Object chave;
	Object valor;
    public static List<Dicionario> dicionarios = new ArrayList<Dicionario>();
    public Dicionario(){

    }
    
    public void setValor(Object chave, Object valor){
    	Dicionario tempDic = new Dicionario();
    	if(chave.toString().startsWith("Chave@") && valor.toString().startsWith("Valor@")) {
    		tempDic.chave = Chave.value;
        	tempDic.valor = Valor.value;
    	}else {
    		if(!valor.toString().startsWith("Valor@")) {
    			tempDic.chave = Chave.value;
    			tempDic.valor = valor;
    		}else if (!chave.toString().startsWith("Chave@")){
    			tempDic.chave = chave;
    			tempDic.valor = Valor.value;
    		}else {
    			tempDic.valor = valor;
    			tempDic.chave = chave;
    		}
    	}
    	dicionarios.add(tempDic);    	
    }
    public String listar(){
    	Dicionario dicionario;
    	String palavras  = "";
			int i = -1;
			if(dicionarios.size() > 0) {
				do{
					i++;
					dicionario = dicionarios.get(i);
					palavras += dicionario.chave+"="+ dicionario.valor+"\n";
				}while(i < dicionarios.size()-1);
			}
	    return palavras;
	}
    public Object getValor(Object objChave){
			Object searchName = Chave.value;
            Object valor = "";
			Dicionario dicionario;
			new Chave(Chave.oldValue);
			int i = -1;
			boolean found = false;
			if(dicionarios.size() > 0) {
				do{
					i++;
					dicionario = dicionarios.get(i);
					if(dicionario.chave.equals(searchName)) {
                        valor = dicionario.valor;
						found = true;
					}
				}while(dicionario.chave != searchName && i < dicionarios.size()-1);
			}
			return valor;
    }
    public String toJson() {
    	Dicionario dicionario;
    	String palavras  = "{";
			int i = -1;
			if(dicionarios.size() > 0) {
				do{
					i++;
					dicionario = dicionarios.get(i);
					palavras += '"'+dicionario.chave.toString()+'"'+":"+'"'+dicionario.valor.toString()+'"'+",";
				}while(i < dicionarios.size()-1);
			}
	    return palavras.substring(0,palavras.length()-1)+"}";
    }
    public Object delValor(Object objChave){
		Object searchName = Chave.value;
        Object valor = "";
		Dicionario dicionario;
		int i = -1;
		boolean found = false;
		if(dicionarios.size() > 0) {
			do{
				i++;
				dicionario = dicionarios.get(i);
				if(dicionario.chave.equals(searchName)) {
					dicionarios.remove(i);
                    valor = dicionario.valor;
					found = true;
				}
			}while(dicionario.chave != searchName && i < dicionarios.size()-1);
		}
		return valor;
    }
    public static void salvar(String nomeArquivo, String conteudo) 
    {
    	Salvavel.salvar(nomeArquivo, conteudo);
    }
}
