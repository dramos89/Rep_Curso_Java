package exUsuarioJavaBeans;

import java.util.Scanner;

public class TestaUsuario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o usuario: ");
		String nome = input.nextLine();
		System.out.println("Digite o email: ");
		String email = input.nextLine();
		System.out.println("Digite a senha: ");
		String senha = input.nextLine();
		
		Usuario usuario = new Usuario(nome, email, senha);
		System.out.println("Nome de usuario: "+usuario.getNome());
		System.out.println("Email de usuario: "+usuario.getEmail());
		System.out.println("Senha de usuario: "+usuario.getSenha());
		
		
		System.out.println("Digite uma nova senha");
		usuario.setSenha(input.nextLine());
		
		System.out.println("Senha de usuario: "+usuario.getSenha());
		input.close();
	}
}
