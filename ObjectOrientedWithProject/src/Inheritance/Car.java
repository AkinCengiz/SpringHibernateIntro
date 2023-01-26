package Inheritance;

public class Car {
	private String brande;
	private String model;
	private String color;
	private String year;
	private int velocity;
	
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public String getBrande() {
		return brande;
	}
	public void setBrande(String brande) {
		this.brande = brande;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public Car()
	{
		this("Togg","Sedan","Kapadokya","2023",220);
	}
	public Car(String brande, String model, String color, String year, int velocity)
	{
		this.brande = brande;
		this.model = model;
		this.color = color;
		this.year = year;
		this.velocity = velocity;
	}
	
	void getCarInfo()
	{
		System.out.print("Marka     : " + this.getBrande() + "\nModel     : " + this.getModel() + "\nHýz       : " + this.getVelocity() + "\nRenk      : " + this.getColor() + "\n" + "Yýl       : " + this.getYear()+"\n******************************\n");
	}
}
