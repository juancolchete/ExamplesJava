public class Chave {
	public static Object value;
	public static Object oldValue;
    public Chave(Object chave) {
    	oldValue = value;
    	value = chave;
    }
    
}
