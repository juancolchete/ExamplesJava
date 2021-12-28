public class Desktop extends Computer{

	public Desktop() {
		
	}
	
	public void inputScreen() {
		
		super.inputScreen();
	}
	
	public void inputColor() {
		
		super.inputColor();
	}
	
	public void inputScreenColor() {
		inputScreen();
		inputColor();
	}
	
	public void setCharacteristics() {
		super.setCharacteristics();
	}
}