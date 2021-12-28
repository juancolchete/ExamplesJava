public class TV extends Eletrodomestic{
	
	private int inches;	

	public TV(String name, String brand, double weight, double value, int potency, boolean estate, String category,int inches) {
		super(name, brand, weight, value, potency, estate, category);
		this.inches = inches;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public void returnPotency() {
		
		System.out.println("The TV " + getName() + " have the potency of: " + getPotency());
	}
	
	public void retornaEstado() {
		
		System.out.println("The TV is " + isEstado());
	}
	
	public void retornaInches() {
			
		System.out.println("The TV " + getName() + " have " + getInches() + " inches");
	}

}
