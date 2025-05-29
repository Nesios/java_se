package day_06;
public class Isogramma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "abcde,f,";
		boolean [] lettereTrovate = new boolean[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c >= 'a' && c <= 'b') {
				int indice = c - 'a';
				if (lettereTrovate[indice]) {
					System.out.println("La frase non è un isogramma");
					return;
				} else {
					lettereTrovate[indice] = true;
				}
			}
		}
		System.out.println("La frase è un isogramma");
	}
}