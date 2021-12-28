import java.util.Scanner;

public abstract class Computer {
	
	private String tamanhoTela;
	private String cor;
	
	public Computer() {	
		
	}			
	
	public String getScreenSize() {
		return tamanhoTela;
	}

	public void setScreenSize(String tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getColor() {
		return cor;
	}

	public void getColor(String cor) {
		this.cor = cor;
	}
	
	public void inputScreen() {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Write the screen size: ");
	    String tamanho = scanner.next();
	    this.tamanhoTela = tamanho;
	}
	
	public void inputColor() {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Write the color: ");
	    String cor = scanner.next();
	    this.cor = cor;
	}
	
	public void inputScreenColor() {
		inputScreen();
		inputColor();
	}
	

	public void informaCaracteristicas() {
			
		System.out.println("Screen size: "+ this.tamanhoTela);
		System.out.println("Screen color: "+this.cor);
		System.out.println("--------------------------------------");
		
	}
	
}