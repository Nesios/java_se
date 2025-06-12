package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		byte numeroByte = 122; // in binario: 01111010
		short numeroShort = numeroByte; // in binario: 00000000 01111010
		int numeroInt = numeroShort; // in binario sarebbero 00000000 00000000 00000000 01111010
		// in binario sarebbero 00000000 0000000 00000000 00000000 00000000 00000000
		// 00000000 01111010
		long numeroLong = numeroInt;
		float numeroFloat = numeroLong;
		double numeroDouble = numeroFloat;
		System.out.println("numeroDouble"+numeroDouble);
	}

}
