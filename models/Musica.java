package models;
import java.util.Date;

public class Musica  extends Midia{
    
    public Musica (String titulo, String autor, Double duracao, Date data, Artista interprete, Artista genero){
        super(titulo, autor, duracao, data, interprete, genero);
    }
    
}
