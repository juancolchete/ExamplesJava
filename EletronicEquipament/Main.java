public class Main {

	public static void main(String[] args) {
	
		Equipment equipment = new Equipment("Computer","DELL",10.0,200.0,500,false);
		
		Eletrodomestic eletroD = new Eletrodomestic("Micro Wave","Philco",10.0,200.0,500,false,"Kitchen");
		
		Eletromecanicos eletroM = new Eletromecanicos("Escalator","Philco",10.0,200.0,500,false,520.0);
		
		Hydraulic hidro = new Hydraulic("Jack","3M",10.0,200.0,500,false,20.0);
		
		WaterTap torneira = new WaterTap("3M","3M",10.0,200.0,500,false,566, "Plastic");
		
		MotoresEletricos motoresE = new MotoresEletricos("Tesla engine","Tesla",10.0,200.0,500,false,520.0, 1233);
		
		TV tv = new TV("TV LG","Philco",10.0,200.0,500,false,"Eletrodomestic", 0);
		
		
		equipment.retornaDados();
		
		hidro.returnPotency();
		hidro.retornaEstado();
		hidro.retornaCapacidade();	
		

		eletroD.returnPotency();
		eletroD.retornaEstado();
		eletroD.retornaCategory();
		

		tv.returnPotency();
		tv.retornaEstado();
		tv.retornaInches();

	
	}

}
