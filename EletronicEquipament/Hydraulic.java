public class Hydraulic extends Equipment {

	 private double capacity;
	 
	 public Hydraulic(String name, String brand, double weight, double value, int potency, boolean estate,double capacity) {
		super(name, brand, weight, value, potency, estate);
		this.capacity = capacity;
	}


	public double getCapacidade() {
		return capacity;
	}


	public void setCapacidade(double capacity) {
		this.capacity = capacity;
	}

	public void returnPotency() {
			
			System.out.println("The hydraulic equipament " + getName() + " have the pontecy: " + getPotency());
	}
		
		public void retornaEstado() {
			
			System.out.println("The hydraulic equipament is " + isEstado());
	}
		
	public void retornaCapacidade() {
				
			System.out.println("The hydraulic equipament " + getName() + " the capacity: " + getCapacidade());
	}
			
		

}
