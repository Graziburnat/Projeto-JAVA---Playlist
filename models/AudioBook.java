package models;

import java.util.Date;

public class AudioBook extends Midia{

    public AudioBook(String titulo, String autor, Double duracao, Date data, Artista interprete, Artista genero){
        super(titulo, autor, duracao, data, interprete, genero);
    }

}
