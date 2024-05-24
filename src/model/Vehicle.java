package model;

public class Vehicle {

	private String id;
	private String brand;
	private double cylinderCapacity;
	
	public Vehicle(String id, String brand, double cylinderCapacity) {
		this.id = id;
		this.brand = brand;
		this.cylinderCapacity = cylinderCapacity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	
	

}
