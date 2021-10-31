
public class Program {
	public static void main(String[] args) { 
		
		Television tv = new Television("Big Television","LG",32,6,1);
		RemoteControl controle = new RemoteControl(10,"LG",2,"Black");
		
		controle.VolumeUp(tv);
		controle.getVolume(tv);
		controle.VolumeDown(tv);	
		controle.getVolume(tv);	
		controle.ChannelUp(tv);
		controle.getChannel(tv);
		controle.ChannelDown(tv);
		controle.getChannel(tv);
		controle.setChannel(tv, 5);
		controle.getVolume(tv);
		controle.getChannel(tv);
		
	}
}
