package exUsuarioJavaBeans;

public class Usuario {
	private String nome;
	private String email;
	private String senha;

	public Usuario(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.setSenha(senha);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setSenha(String senha){
		if (validaSenha(senha))
			this.senha = senha;
	}

	public String getSenha(){
		return this.senha;
	}

	private boolean validaSenha(String senha){
		return ValidatorSenha.checar(senha);
	}
}
