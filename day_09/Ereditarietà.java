package day_09.ereditarietà;

public class EsempioWrapper {
	public static void main(String[] args) {
		Double d = 34.6;
		Integer i = 10;
		Number[] numeri = { d, i };
		double somma = 0;
		for (Number n : numeri) {
			if (n instanceof Double) {
				System.out.println("è una double " + n);

			} else if (n instanceof Integer) {
				System.out.println("è un' integer " + n);
				double x = (Integer) n;
			}
			somma += n.doubleValue();
		}
		System.out.println(somma);

	}
}