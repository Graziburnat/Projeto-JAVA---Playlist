package views.viewMusicas;
import controllers.MusicaController;
import models.Musica;
import utils.Console;

public class CadastrarMusica {

    public void compilar(){
        Musica musica = new Musica(null, null, null, null, null, null);        
        MusicaController musicaController = new MusicaController();
        System.out.println("\n -- CADASTRO DE MÚSICAS -- \n");
        musica.setTitulo(Console.readString("Digite o nome da música: "));
        musica.setAutor(Console.readString("Digite o nome do compositor: "));
        musica.setDuracao(Console.readDouble("Digite a duração da música: "));
        musicaController.cadastrar(musica);
        System.out.println("\nMúsica cadastrada com sucesso !!!");
    }
    
}
