package views.viewPA;

import controllers.AudioBookController;
import models.AudioBook;

public class ListarAudioBooks {

    public void listar(){
        AudioBookController audioBookController = new AudioBookController();

        AudioBook audioBook = new AudioBook(null, null, null, null, null, null);

        audioBook.setTitulo("TituloRandom1");
        audioBook.setAutor("AutorRandom1");
        audioBook.setTitulo("TituloRandom2");
        audioBook.setAutor("AutorRandom2");
        audioBookController.cadastrar(audioBook);

        System.out.println("-- LISTA DE PODCASTS --");
        for(AudioBook audioBookCadastrado : audioBookController.listar()){
            System.out.println(audioBookCadastrado);
        }
    }
    
}
