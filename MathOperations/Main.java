package Questao3;

public class Main {
	public static void main(String[] args) {
		Calculadora objcal = new Calculadora();
		System.out.println(objcal.calcular(3,2));
		System.out.println(objcal.calcular(5.5,2.0));
		
		Multiplicacao objmulti = new Multiplicacao();
		System.out.println(objmulti.calcular(3,2));
		System.out.println(objmulti.calcular(5.5,2.0));

		Divisao objdiv = new Divisao();
		System.out.println(objdiv.calcular(3,2));
		System.out.println(objdiv.calcular(5.5,2.0));
		
		Subtracao objsub = new Subtracao();
		System.out.println(objsub.calcular(3,2));
		System.out.println(objsub.calcular(5.5,2.0));
		
		Adicao objad = new Adicao();
		System.out.println(objad.calcular(3,2));
		System.out.println(objad.calcular(5.5,2.0));
	}
}	
