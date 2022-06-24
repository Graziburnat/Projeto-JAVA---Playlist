package views.viewPlaylist;

import models.Playlist;
import models.ItemPlay;
import models.Login;
import models.Versao;
import controllers.PlaylistController;
import controllers.VersaoController;
import controllers.LoginController;
import utils.Console;

public class CadastrarPlaylist {

    public void cadastrar() {

        Playlist playlist = new Playlist();
        ItemPlay mp = new ItemPlay();
        VersaoController versaoController = new VersaoController();
        PlaylistController playlistController = new PlaylistController();
        LoginController loginController = new LoginController();

        System.out.println("\n -- CRIAÇÃO DE PLAYLISTS -- \n");

        playlist.setNome(Console.readString("Digite o nome da playlist: "));

        String criador = Console.readString("Informe o nome do usuário: ");
        Login usuario = loginController.buscar(criador);
        if (usuario != null) {
            playlist.setLogin(usuario);

            do {

                mp = new ItemPlay();
                String nomeVersao = Console.readString("Digite a música que deseja adicionar: ");
                Versao versao = versaoController.buscar(nomeVersao);
                if (versao != null) {
                    mp.setVersao(versao);
                    playlist.getVersoes().add(mp);
                } else {
                    System.out.println("Música não encontrada");
                }

            } while (Console.readString("Deseja adicionar mais Músicas? Digite S ou N").toUpperCase().equals("S"));

            playlistController.cadastrar(playlist);
            System.out.println("Música cadastrada!");

        } else {
            System.out.println("Usuário não encontrado!");
        }

    }
}