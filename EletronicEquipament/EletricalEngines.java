public class EletricalEngines extends EletricalMecanic {
		
	private int RPM;
	
	public EletricalEngines(String name, String brand, double weight, double value, int potency, boolean estate,double force,int RPM) {
		super(name, brand, weight, value, potency, estate, force);
		this.RPM = RPM;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}
	
	public void retornaPotency() {
		
		System.out.println("The eletric engine" + getName() + " tem pot�ncia de: " + getPotency());
	}
	
	public void retornaEstado() {
		
		System.out.println("The eletric engine is" + isOn());
	}
	
	public void retornaRPM() {
			
		System.out.println("The eletric engine" + getName() + " have: " + getRPM()+ " RPM");
	}


}
