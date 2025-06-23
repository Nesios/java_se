package day_12.Tennis;

import java.util.ArrayList;

public class Campo {
    private final int ORE_APERTURA = 8;
    private final int ORE_CHIUSURA = 20;
    private ArrayList<Prenotazione> prenotazioni;

    public Campo() {
        this.prenotazioni = new ArrayList<>();
    }

    public boolean addPren(int inizio, int fine, String unNomeCliente) {
        if (inizio < ORE_APERTURA || fine > ORE_CHIUSURA || inizio >= fine) {
            return false; // orari non validi
        }

        Prenotazione nuovaPren = new Prenotazione(unNomeCliente, inizio, fine);
        for (Prenotazione p : prenotazioni) {
            if (p.siSovrappone(nuovaPren)) {
                return false; // sovrapposizione con un'altra prenotazione
            }
        }

        prenotazioni.add(nuovaPren);
        return true;
    }

    public boolean removePren(int inizio, int fine, String unNomeCliente) {
        for (Prenotazione p : prenotazioni) {
            if (p.getNomeCliente().equals(unNomeCliente) && p.getInizio() == inizio && p.getFine() == fine) {
                prenotazioni.remove(p);
                return true;
            }
        }
        return false;
    }

    public double utilizzo() {
        int oreOccupate = 0;
        for (Prenotazione p : prenotazioni) {
            oreOccupate += p.getFine() - p.getInizio();
        }
        int oreDisponibili = ORE_CHIUSURA - ORE_APERTURA;
        return (double) oreOccupate / oreDisponibili * 100;
    }

    @Override
    public String toString() {
        if (prenotazioni.isEmpty()) {
            return "Nessuna prenotazione.";
        }
        StringBuilder sb = new StringBuilder("Prenotazioni del campo:\n");
        for (Prenotazione p : prenotazioni) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}