public class DVD extends Eletrodomestic{
	
	private boolean HDMI;
	private String readType;
	
	public DVD(String name, String brand, double weight, double value, int potency, boolean estate, String category,boolean HDMI,String readType) {
		super(name, brand, weight, value, potency, estate, category);
		
		this.HDMI = HDMI;
		this.readType = readType;
	}

	public boolean isHDMI() {
		return HDMI;
	}

	public void setHDMI(boolean hdmi) {
		HDMI = hdmi;
	}

	public String getReadType() {
		return readType;
	}

	public void setReadType(String readType) {
		this.readType = readType;
	}
	
	public void returnPotency() {
		
		System.out.println("The DVD " + getName() + " have the potency of: " + getPotency());
	}
	
	public void returnEstate() {
		
		System.out.println("The DVD is " + isEstate());
	}
	
	public void returnType() {
			
		System.out.println("The DVD is " + getName() + " have the read type of: " + getReadType());
	}
	
	public boolean returnHDMI() {
		
		return this.HDMI;
	}
	
	

}
