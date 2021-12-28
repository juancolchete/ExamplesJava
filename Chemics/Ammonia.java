public class Amonia extends PureSubstance{
	public void startBoilingPoint(double temperature) {
		if(temperature >= -33.34) {
			System.out.println("Entered in bolling point");
		}
	}
	public void startFusionPoint(double temperature) {
		if(temperature >= -77.73) {
			System.out.println("Entered in fusion point");
		}
	}
}