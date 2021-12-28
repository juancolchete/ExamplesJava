public class Main {
	public static void main(String[] args) {
		PureSubstance objPureSubstance = new PureSubstance();
		objPureSubstance.startBoilingPoint(100);
		objPureSubstance.startFusionPoint(100);
		
		Water objWater = new Water();
		objWater.startBoilingPoint(100);
		objWater.startFusionPoint(0);
		objWater.startBoilingPoint(99);
		objWater.startFusionPoint(-1);
		
		Amonia objamonia = new Amonia();
		objamonia.startBoilingPoint(-33.34);
		objamonia.startFusionPoint(-77.73);
		objamonia.startBoilingPoint(-33.35);
		objamonia.startFusionPoint(-77.74);
		
		Alcohol objAlcohol = new Alcohol();
		objAlcohol.startBoilingPoint(78.4);
		objAlcohol.startFusionPoint(0);
		objAlcohol.startBoilingPoint(78.3);
		objAlcohol.startFusionPoint(-1);
	}
}
