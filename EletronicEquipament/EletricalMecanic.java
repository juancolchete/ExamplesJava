public class EletricalMecanic extends Equipment {
	
   private double force;
   
   public EletricalMecanic(String name, String brand, double weight, double value, int potency, boolean estate,double force) {
	   super(name, brand, weight, value, potency, estate);
	   this.force = force;
	 
   }

   public double getPower() {
	return force;
   }


   public void setForce(double force) {
	this.force = force;
   }

	public void returnPotency() {
		
		System.out.println("The eletronic equipament " + getRPM() + " tem potency of: " + getPotency());
	}
	
	public void returnEstate() {
		
		System.out.println("The eletronic equipament is " + isOn());
	}
	
	 public void retornaForce() {
			
			System.out.println("The eletronic equipament " + getRPM() + " have the force of: " + getPower());
	}
	


}
