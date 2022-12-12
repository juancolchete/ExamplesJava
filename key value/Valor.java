public class Valor {
	public static Object value;
	public static Object oldValue;
    public Valor(Object valor) {
    	oldValue = value;
    	value = valor;
    }
}
