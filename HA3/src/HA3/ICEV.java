package HA3;

public class ICEV extends Vehicle {
	ICEV() {
		manu = new Manufacture();
		engine = new CombustionEngine();
	}

	public void ShowCharateristics() {		
		System.out.format("ICEV infomation: Model:%s - Years of manufacture:%d - Color:%s - Engine:"
				, manu.getModel(), manu.getYearofManufacture(), manu.getColor());
		engine.printEngine();
	}
}