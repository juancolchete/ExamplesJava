public class Equipment {
	
	private String name;
	private String brand;
	private double weight;
	private double value;
	private int potency;
	private boolean estate;
	
	public Equipment(String name, String brand, double weight, double value, int potency, boolean estate) {
		super();
		this.name = name;
		this.brand = brand;
		this.weight = weight;
		this.value = value;
		this.potency = potency;
		this.estate = estate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getValor() {
		return value;
	}
	public void setValor(double value) {
		this.value = value;
	}
	
	public int getPotency() {
		return potency;
	}
	

	public void setPotency(int potency) {
		this.potency = potency;
	}


	public boolean isOn() {
		return estate;
	}

	public void setEstado(boolean estate) {
		this.estate = estate;
	}

	public void retornaDados() {
		System.out.println("------------------------------");
			System.out.println(" name: " + this.name
			+" \n Brand: " + this.brand 
			+" \n Weight: " + this.weight 
			+" \n Valor: " + this.value
			+" \n Potency: " + this.potency);		
		System.out.println("------------------------------");
	}
	

}
