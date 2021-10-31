
public class Television {
	
	private String name;
	private String brand;
	private int inches;
	private int volume;
	private int channel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public Television(String name, String brand, int inches, int volume, int channel) {
		this.name = name;
		this.brand = name;
		this.inches = inches;
		this.volume = volume;
		this.channel = channel;
	}
	
}
