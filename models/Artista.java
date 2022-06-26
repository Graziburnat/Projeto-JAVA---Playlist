package models;

import models.contracts.IArtista;

public class Artista implements IArtista {

    private String artista;
    // private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    // public String getGenero() {
    //     return genero;
    // }

    // public void setGenero(String genero) {
    //     this.genero = genero;
    // }

    @Override
    public String toString() {
        return

        " | Artista : " + artista + " ";

    }
}