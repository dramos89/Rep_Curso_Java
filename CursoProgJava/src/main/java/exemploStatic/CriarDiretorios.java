package exemploStatic;

public class CriarDiretorios {
	public static void main(String[] args) {
		Diretorio diretorio1 = new Diretorio();
		Diretorio diretorio2 = new Diretorio();
		Diretorio diretorio3 = new Diretorio();
		Diretorio diretorio4 = new Diretorio();

		System.out.println(diretorio1.quantidade);
		System.out.println(diretorio2.quantidade);
		System.out.println(diretorio3.quantidade);
		System.out.println(diretorio4.quantidade);
		System.out.println(diretorio1.quantidadeInstancia);
		System.out.println(diretorio2.quantidadeInstancia);
		System.out.println(diretorio3.quantidadeInstancia);
		System.out.println(diretorio4.quantidadeInstancia);
		System.out.println(Diretorio.quantidade);
	}
}
