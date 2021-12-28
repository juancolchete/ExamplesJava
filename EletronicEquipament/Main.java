public class Main {

	public static void main(String[] args) {
	
		Equipment equipment = new Equipment("Computer","DELL",10.0,200.0,500,false);
		
		Eletrodomestic eletroD = new Eletrodomestic("Micro Wave","Philco",10.0,200.0,500,false,"Kitchen");
		
		EletricalMecanic eletroM = new EletricalMecanic("Escalator","Philco",10.0,200.0,500,false,520.0);
		
		Hydraulic hidro = new Hydraulic("Jack","3M",10.0,200.0,500,false,20.0);
		
		WaterTap torneira = new WaterTap("3M","3M",10.0,200.0,500,false,566, "Plastic");
		
		EletricalEngines motoresE = new EletricalEngines("Tesla engine","Tesla",10.0,200.0,500,false,520.0, 1233);
		
		TV tv = new TV("TV LG","Philco",10.0,200.0,500,false,"Eletrodomestic", 0);
		
		
		equipment.retornaDados();
		
		hidro.returnPotency();
		hidro.returnEstate();
		hidro.retornaCapacidade();	
		

		eletroD.returnPotency();
		eletroD.returnEstate();
		eletroD.retornaCategory();
		

		tv.returnPotency();
		tv.returnEstate();
		tv.retornaInches();

	
	}

}
