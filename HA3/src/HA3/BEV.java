package HA3;

public class BEV extends Vehicle {
	BEV() {
		manu = new Manufacture();
		engine = new ElectricEngine();
	}

	public void ShowCharateristics() {		
		System.out.format("BEV infomation: Model:%s - Years of manufacture:%d - Color:%s - Engine:"
				, manu.getModel(), manu.getYearofManufacture(), manu.getColor());
		engine.printEngine();
	}
}