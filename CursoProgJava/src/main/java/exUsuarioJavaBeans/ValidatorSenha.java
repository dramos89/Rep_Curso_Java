package exUsuarioJavaBeans;

public class ValidatorSenha {
	static final int QUANTIDADE_MINIMA = 5;
	
	public static boolean checar(String senha){
		return ((qtdMinima(senha, QUANTIDADE_MINIMA)) && (contemLetra(senha)) && (contemNum(senha)));
	}
	private static boolean contemNum(String arg0){
		for (int i = 0; i < arg0.length(); i++){
			if (Character.isDigit(arg0.charAt(i)))
				return true;
		}
		return false;
	}

	private static boolean contemLetra(String arg0){
		for (int i = 0; i < arg0.length(); i++){
			if (Character.isLetter(arg0.charAt(i)))
				return true;
		}
		return false;
	}

	private static boolean qtdMinima(String arg0, int qtdMinima){
		return (arg0.length() >= qtdMinima);
	}
}
