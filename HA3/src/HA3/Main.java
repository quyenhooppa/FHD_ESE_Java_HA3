package HA3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[3];
		
		//
		vehicles[0] = new ICEV();
		vehicles[0].getManu().setModel("Lexus");
		vehicles[0].getManu().setColor("Silver");
		vehicles[0].getManu().setYearofManufacture(2023);
		
		//
		vehicles[1] = new BEV();
		vehicles[1].getManu().setModel("BMW");
		vehicles[1].getManu().setColor("Blue");
		vehicles[1].getManu().setYearofManufacture(2024);
		
		//
		vehicles[2] = new HybridV();
		vehicles[2].getManu().setModel("Toyota");
		vehicles[2].getManu().setColor("White");
		vehicles[2].getManu().setYearofManufacture(2024);
		
		// print all vehicles
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].ShowCharateristics();
		}
	}
}
