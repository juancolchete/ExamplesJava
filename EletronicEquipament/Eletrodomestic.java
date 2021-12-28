public class Eletrodomestic extends Equipment{
	
	private String category;
	
	public Eletrodomestic(String name, String brand, double weight, double value, int potency, boolean estate,String category) {
		super(name, brand, weight, value, potency, estate);
		this.category = category;
		
	}	


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void returnPotency() {
		
		System.out.println("The eltrodomestic " + getName() + " have : " + getPotency());
	}
	
	public void retornaEstado() {
		
		System.out.println("The eltrodomestic is " + isEstado());
	}
	
	
	public void retornaCategory() {
		
		System.out.println("The eltrodomestic " + getName() + " is of: " + getCategory()+" category");
	}
	

}
