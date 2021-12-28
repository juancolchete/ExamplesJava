public class Main {
	public static void main(String[] args) {
		SubstanciaPura objsubpura = new SubstanciaPura();
		objsubpura.startBoilingPoint(100);
		objsubpura.startFusionPoint(100);
		
		Agua objagua = new Agua();
		objagua.startBoilingPoint(100);
		objagua.startFusionPoint(0);
		objagua.startBoilingPoint(99);
		objagua.startFusionPoint(-1);
		
		Amonia objamonia = new Amonia();
		objamonia.startBoilingPoint(-33.34);
		objamonia.startFusionPoint(-77.73);
		objamonia.startBoilingPoint(-33.35);
		objamonia.startFusionPoint(-77.74);
		
		Alcool objalcool = new Alcool();
		objalcool.startBoilingPoint(78.4);
		objalcool.startFusionPoint(0);
		objalcool.startBoilingPoint(78.3);
		objalcool.startFusionPoint(-1);
	}
}
