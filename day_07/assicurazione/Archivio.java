package day_07.assicurazione;

import java.time.LocalDate;

public class Archivio {

    public static void main(String[] args) {
        Cliente bruno = new Cliente("cf1", "bruno", "rossi", LocalDate.of(1985, 6, 25));
        Cliente carla = new Cliente("cf2", "calra", "verdi", LocalDate.of(1995, 12, 3));
        Cliente rosa = new Cliente("cf3", "rosa", "gialla", LocalDate.of(2000, 7, 21));
        Veicolo veicolo1 = new Veicolo("targa1", bruno);
        Veicolo veicolo2 = new Veicolo("targa2", carla);
        Veicolo veicolo3 = new Veicolo("targa3", rosa);
        System.out.println(veicolo1);
        System.out.println(veicolo2);
        System.out.println(veicolo3);
        System.out.println("-----------------");
        Veicolo[] archivio={veicolo1,veicolo2,veicolo3};
        for (int i=0; i<archivio.length; i++){
            System.out.println(archivio[i]);
        }
    }

}
