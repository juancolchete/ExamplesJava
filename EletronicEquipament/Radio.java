public class Radio extends Eletrodomestic{

	private String frequency;

	public Radio(String name, String brand, double weight, double value, int potency, boolean estate, String category,String frequency) {
		super(name, brand, weight, value, potency, estate, category);
		this.frequency = frequency;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public void retornaPotency() {
		
		System.out.println("The radio " + getName() + "have the potency of: " + getPotency());
	}
	
	public void retornaEstado() {
		
		System.out.println("The radio " + isEstado());
	}
	
	public void retornaFrequency() {
			
		System.out.println("The radio " + getName() + " works with that: " + getFrequency()+"frequencies");
	}

}
