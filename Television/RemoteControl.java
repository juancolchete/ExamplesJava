
public class RemoteControl {

	private int size;
	private String brand;
	private int batteries;
	private String color;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getBatteries() {
		return batteries;
	}
	public void setBatteries(int batteries) {
		this.batteries = batteries;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public RemoteControl(int size, String brand, int batteries, String color) {
		this.size = size;
		this.brand = brand;
		this.batteries = batteries;
		this.color = color;
	}
	
	public void VolumeUp(Television tv) {
		int currentVolume = tv.getVolume();
		int newVolume = currentVolume + 1;
		tv.setVolume(newVolume);
	}
	
	public void VolumeDown(Television tv) {
		int currentVolume = tv.getVolume();
		int newVolume = currentVolume - 1;
		if(newVolume <= 0) {
			newVolume = 0;
		}
		tv.setVolume(newVolume);
	}
	
	public void ChannelUp(Television tv) {
		int currentChannel = tv.getChannel();
		int newChannel = currentChannel + 1;
		tv.setChannel(newChannel);
	}
	
	public void ChannelDown(Television tv) {
		int currentChannel = tv.getChannel();
		int newChannel = currentChannel - 1;
		if(newChannel <= 0) {
			newChannel = 0;
		}
		tv.setChannel(newChannel);
	}
	
	public void setChannel(Television tv, int channel) {
		if(channel <= 0) {
			channel = 0;
		}
		tv.setChannel(channel);
	}
	
	public void getVolume(Television tv) {
		System.out.println("Current volume: " + tv.getVolume());
	}
	
	public void getChannel(Television tv) {
		System.out.println("Current channel: " + tv.getChannel());
	}

}
