package tasks;

public class Car extends Object {
	
	private int year;
	private String make;
	private Double speed;
	
//	public Car() {
//		
//	}
	public Car(int year, String make, Double speed) {
		
		this.year = year;
		this.make = make;
		this.speed = speed;
	}
	
	public int getYear() {
		
		Integer x   = new Integer(222);
		
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	
	
	@Override
	public String toString() {
		return this.make + " car is made in " + this.year ;
	}
	
	
	
}
