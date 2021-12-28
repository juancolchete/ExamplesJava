public class main {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();	
		desktop.inputScreen();
		desktop.inputColor();
		desktop.inputScreenColor();
		desktop.informaCaracteristicas();
		
		Notebook notebooks = new Notebook();	
		notebooks.inputScreen();
		notebooks.inputColor();
		notebooks.inputScreenColor();
		notebooks.informaCaracteristicas();
		
		Ultrabook ultrabooks = new Ultrabook();	
		ultrabooks.inputScreen();
		ultrabooks.inputColor();
		ultrabooks.inputScreenColor();
		ultrabooks.informaCaracteristicas();
		
	}

}
