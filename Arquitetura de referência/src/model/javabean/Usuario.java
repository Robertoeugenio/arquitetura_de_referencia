package model.javabean;

public class Usuario {
	private String nome,nomeUsuario,senha;

	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	
	public Usuario(String nome, String nomeUsuario, String senha) {
		super();
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
