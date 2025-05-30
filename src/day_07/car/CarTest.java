package day_07.car;

public class CarTest {
	public static void main(String[] args) {
		Car panda = new Car();
		Car ferrari = new Car("A123BK", "Ferrari", "SF90", 100.0, 1);
		Car bmw = new Car("GA78M", "BMW", "M4Competition", 60.0, 0.8);
		System.out.println("Targa Ferrari: " + ferrari.getTarga());
		ferrari.setTarga("AAAAAAA");
		System.out.println("Targa Ferrari: " + ferrari.getTarga());
		panda.setTarga("DFA897H");
		panda.setMarca("Fiat");
		panda.setModello("Panda");
		panda.setFuel(30.0);
		panda.setConsumoMedio(0.2);
		System.out.println(panda.toString());
		System.out.println("fuel" + ferrari.getFuel());
		CarController.aggiornaFuel(ferrari, 10);
		System.out.println("fuel" + ferrari.getFuel());
		System.out.println(ferrari);
		CarController.aggiornaFuel(ferrari, 10);
		/*Sintatticamente corretto ma logicamente sbagliato*/
		System.out.println(ferrari.toString());
		CarController controller=new CarController();
		controller.aggiornaFuel(ferrari, 0);
		System.out.println(bmw);
		CarController.addFuel(bmw, 10);
		System.out.println(bmw);
	}
}