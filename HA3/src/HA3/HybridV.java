package HA3;

public class HybridV extends Vehicle {
	HybridV() {
		manu = new Manufacture();
		engine = new HybridEngine();
	}

	public void ShowCharateristics() {	
		System.out.format("HybridV infomation: Model:%s - Years of manufacture:%d - Color:%s - Engine:"
				, manu.getModel(), manu.getYearofManufacture(), manu.getColor());
		engine.printEngine();
	}
}