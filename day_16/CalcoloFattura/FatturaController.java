package day_16.CalcoloFattura;

import java.math.BigDecimal;

public class FatturaController {
	public static void calcoloFattura(Cliente cliente) {

		// Controllo se il cliente è un ClienteLuce
		if (cliente instanceof ClienteLuce) {
			ClienteLuce clienteLuce = (ClienteLuce) cliente;

			// Se ha consumato meno di 300 kWh
			if (clienteLuce.getKwh() < 300) {
				// imposto il prezzo per kWh a 0.25 euro
				clienteLuce.setPrezzoKwh(new BigDecimal("0.25"));

				// Se ha consumato tra 300 (compreso) e 700 (escluso) kWh
			} else if (clienteLuce.getKwh() >= 300 && clienteLuce.getKwh() < 700) {
				// imposto il prezzo per kWh a 0.18 euro
				clienteLuce.setPrezzoKwh(new BigDecimal("0.18"));

				// Se ha consumato 700 kWh o più
			} else {
				// imposto il prezzo per kWh a 0.15 euro
				clienteLuce.setPrezzoKwh(new BigDecimal("0.15"));
			}

			// calcolo il totale da pagare (vale per tutte le fasce)
			clienteLuce
					.setPrezzoDaPagare(BigDecimal.valueOf(clienteLuce.getKwh()).multiply(clienteLuce.getPrezzoKwh()));

		} else if (cliente instanceof ClienteGas) {
			ClienteGas clienteGas = (ClienteGas) cliente;

			// Se ha consumato meno di 50 M3
			if (clienteGas.getM3() < 50) {
				// imposto il prezzo per M3 a 1.00 euro
				clienteGas.setPrezzoM3(new BigDecimal("1.00"));

				// Se ha consumato tra 50 (compreso) e 80 (escluso) M3
			} else if (clienteGas.getM3() >= 50 && clienteGas.getM3() < 80) {
				// imposto il prezzo per M3 a 0.80 euro
				clienteGas.setPrezzoM3(new BigDecimal("0.80"));

				// Se ha consumato 80 M3 o più
			} else {
				// imposto il prezzo per M3a 0.7 euro
				clienteGas.setPrezzoM3(new BigDecimal("0.7"));
			}

			// calcolo il totale da pagare (vale per tutte le fasce)
			clienteGas.setPrezzoDaPagare(BigDecimal.valueOf(clienteGas.getM3()).multiply(clienteGas.getPrezzoM3()));
		} else if (cliente instanceof ClienteFisso) {
			ClienteFisso clienteFisso = (ClienteFisso) cliente;
			if (clienteFisso.getContratto() == ContrattoFisso.STANDARD) {
				clienteFisso.setPrezzoDaPagare(BigDecimal.valueOf(30));
			} else if (clienteFisso.getContratto() == ContrattoFisso.SPECIAL) {
				clienteFisso.setPrezzoDaPagare(BigDecimal.valueOf(50));
			} else {
				clienteFisso.setPrezzoDaPagare(BigDecimal.valueOf(60));
			}
		} else {
			ClienteMobile clienteMobile = (ClienteMobile) cliente;
			if (clienteMobile.getGiga() <= 30) {
				clienteMobile.setPrezzoDaPagare(BigDecimal.valueOf(8));
			} else if (clienteMobile.getGiga() > 30 && clienteMobile.getGiga() < 80) {
				clienteMobile.setPrezzoDaPagare(BigDecimal.valueOf(12));
			} else {
				clienteMobile.setPrezzoDaPagare(BigDecimal.valueOf(15));
			}
		}
	}
}