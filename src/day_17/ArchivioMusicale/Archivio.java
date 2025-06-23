package day_17.ArchivioMusicale;

import java.util.*;

public class Archivio {
    private Set<Artista> artisti;
    private Set<Album> album;
    private Set<Genere> generi;
    private List<Brano> brani;

    public Archivio() {
        artisti = new HashSet<>();
        album = new HashSet<>();
        generi = new HashSet<>();
        brani = new ArrayList<>();
    }

    // Metodo aggiornato: prende genere come String
    public void aggiungiBrano(String titoloBrano, String nomeArtista, String titoloAlbum, int anno, String nomeGenere) {
        Artista artista = trovaOppureCreaArtista(nomeArtista);
        Album alb = trovaOppureCreaAlbum(titoloAlbum);
        Genere gen = trovaOppureCreaGenere(nomeGenere);

        Brano brano = new Brano(titoloBrano, artista, alb, gen);
        brani.add(brano);
    }

    private Artista trovaOppureCreaArtista(String nome) {
        Artista temp = new Artista(nome);
        if (artisti.contains(temp)) {
            for (Artista a : artisti) {
                if (a.equals(temp)) return a;
            }
        }
        artisti.add(temp);
        return temp;
    }

    private Album trovaOppureCreaAlbum(String titolo) {
        Album temp = new Album(titolo);
        if (album.contains(temp)) {
            for (Album a : album) {
                if (a.equals(temp)) return a;
            }
        }
        album.add(temp);
        return temp;
    }

    private Genere trovaOppureCreaGenere(String nome) {
        Genere temp = new Genere(nome);
        if (generi.contains(temp)) {
            for (Genere g : generi) {
                if (g.equals(temp)) return g;
            }
        }
        generi.add(temp);
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Archivio musicale:\n");
        for (Brano b : brani) {
            sb.append(b).append("\n");
        }
        return sb.toString();
    }
}