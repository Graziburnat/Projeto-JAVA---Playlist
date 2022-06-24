package models;
import java.util.ArrayList;

import models.contracts.IPlaylist;

public class Playlist implements IPlaylist{

	public Playlist(){
        versoes = new ArrayList<ItemPlay>();
        login = new Login();
    }

    private String nome;
    private Login login;
    private ArrayList<ItemPlay> versoes;

	public ArrayList<ItemPlay> getVersoes() {
		return versoes;
	}



	public void setVersoes(ArrayList<ItemPlay> versoes) {
		this.versoes = versoes;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Login getLogin() {
		return login;
	}



	public void setLogin(Login login) {
		this.login = login;
	}


	@Override
    public String toString() {
        return " || Playlist : " + nome + " || Usuário: " + login.getUsuario();
    }

}
