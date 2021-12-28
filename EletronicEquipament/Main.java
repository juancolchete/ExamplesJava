public class Main {

	public static void main(String[] args) {
	
		Equipment equipment = new Equipment("Computer","DELL",10.0,200.0,500,false);
		
		Eletrodomestic eletroD = new Eletrodomestic("Microondas","Philco",10.0,200.0,500,false,"Cozinha");
		
		Eletromec�nicos eletroM = new Eletromec�nicos("Escada rolante","Philco",10.0,200.0,500,false,520.0);
		
		Hydraulic hidro = new Hydraulic("Macaco hidr�ulico","3M",10.0,200.0,500,false,20.0);
		
		WaterTap torneira = new WaterTap("3M","3M",10.0,200.0,500,false,566, "Pl�stico");
		
		MotoresEletricos motoresE = new MotoresEletricos("Motor tesla","Tesla",10.0,200.0,500,false,520.0, 1233);
		
		TV tv = new TV("TV LG","Philco",10.0,200.0,500,false,"Eletrodom�stico", 0);
		
		
		equipment.retornaDados();
		
		hidro.retornaPotency();
		hidro.retornaEstado();
		hidro.retornaCapacidade();	
		

		eletroD.retornaPotency();
		eletroD.retornaEstado();
		eletroD.retornaCategory();
		

		tv.retornaPotency();
		tv.retornaEstado();
		tv.retornaInches();

	
	}

}
