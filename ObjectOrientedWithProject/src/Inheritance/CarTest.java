package Inheritance;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.getCarInfo();
		
		ElectricCar electricCar = new ElectricCar("Togg","CX-Coupe","Anadolu","2023",220,"Electric 2.0",990,100);
		electricCar.getCarInfo();

	}

}
