public class Alcohol extends PureSubstance{
	public void startBoilingPoint(double temperature) {
		if(temperature >= 78.4) {
			System.out.println("Entered in bolling point");
		}
	}
	public void startFusionPoint(double temperature) {
		if(temperature >= 0) {
			System.out.println("Entered in fusion point");
		}
	}
}
