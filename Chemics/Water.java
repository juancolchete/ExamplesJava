public class Agua extends PureSubstance{
	public void startBoilingPoint(double temperature) {
		if(temperature >= 100) {
			System.out.println("Entered in bolling point");
		}
	}
	public void startFusionPoint(double temperature) {
		if(temperature >= 0) {
			System.out.println("Entered in fusion point");
		}
	}
}
