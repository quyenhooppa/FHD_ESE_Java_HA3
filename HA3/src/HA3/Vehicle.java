package HA3;

public abstract class Vehicle {
	Manufacture manu;
	Engine engine; 
	
	abstract void ShowCharateristics();
	
	public Manufacture getManu() {
		return manu;
	}

	public void setManu(Manufacture manu) {
		this.manu = manu;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}