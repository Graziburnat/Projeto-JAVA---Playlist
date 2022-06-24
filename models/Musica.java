package models;
import models.contracts.IMusica;

public class Musica implements IMusica{
    
    private String nome;
    private String compositor;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return 
            " | Música: " + nome + " | Compositor: " + compositor;
    }
    
}
