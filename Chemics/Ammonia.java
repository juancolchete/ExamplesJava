public class Amonia extends PureSubstance{
	public void startBoilingPoint(double temp) {
		if(temp >= -33.34) {
			System.out.println("Entered in bolling point");
		}
	}
	public void startFusionPoint(double temp) {
		if(temp >= -77.73) {
			System.out.println("Entered in fusion point");
		}
	}
}