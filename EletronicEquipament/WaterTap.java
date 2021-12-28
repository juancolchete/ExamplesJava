public class WaterTap extends Hydraulic {
	
	private String material;	

	public WaterTap(String name, String brand, double weight, double value, int potency, boolean estate,double capacity,String material) {
		super(name, brand, weight, value, potency, estate, capacity);
		this.material = material;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void returnPotency() {
		
		System.out.println("Ther water trap " + getName() + " have the potency of: " + getPotency());
	}
	
	public void returnEstate() {
		
		System.out.println("Ther water trap is " + isEstado());
	}
	
	public void returnMaterial() {
			
		System.out.println("Ther water trap " + getName() + " is made of: " + getMaterial());
	}

}
