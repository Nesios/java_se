package day_08.car;

public class Car {
	private static int contaIstanze = 0;
	private double fuel;
	private double maxSpeed;

	public Car() { // costruttore di default
		contaIstanze++;
	};

	public Car(double maxSpeed) {
		super();
		contaIstanze++;
		this.maxSpeed = maxSpeed;
	}

	// definizione costruttore parametrico
	public Car(double fuel, double maxSpeed) {
		contaIstanze++;
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	public static int getContaIstanze() {
		return contaIstanze;
	}

	public static void setContaIstanze(int contaIstanze) {
		Car.contaIstanze = contaIstanze;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + "]";
	}

}
