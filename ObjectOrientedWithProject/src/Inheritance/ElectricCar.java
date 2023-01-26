package Inheritance;

public class ElectricCar extends Car {
	
	private String motor;
	private int tork;
	private int battery;
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getTork() {
		return tork;
	}
	public void setTork(int tork) {
		this.tork = tork;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public ElectricCar()
	{
		super();
		this.motor = "Elektrik 1.6";
		this.battery = 100;
		this.tork = 750;
	}
	public ElectricCar(String brande, String model, String color, String year, int velocity, String motor, int tork, int battery)
	{
		super(brande, model, color, year, velocity);
		this.motor = motor;
		this.tork = tork;
		this.battery = battery;
	}
	void getCarInfo()
	{
		System.out.print("Marka     : " + this.getBrande() + "\nModel     : " + this.getModel() + "\nHýz       : " + this.getVelocity() + "\nRenk      : " + this.getColor() + 
				"\n" + "Yýl       : " + this.getYear() + "\nMotor     : "+this.getMotor() + "\nTork      : " + this.getTork() + "\nBatarya   : " + this.getBattery() + "\n******************************\n");
	}

}
