package aula6.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ExemploLeituraArq {
	private static final Charset c = Charset.forName("UTF-8");
	public static void main(String[] args) throws IOException {
		String caminho = "/home/java01/exemplo.txt";
		String caminhoW = "/home/java01/exemploWriter.txt";
		String conteudo = "Arquivo usando writer";
		//gravarArquivo(caminho, c);
		//lerArquivo(caminho, c);
		gravarArqComWriter(caminhoW, conteudo);
		lerArqComReader(caminhoW);
	}

/*Exemplo de baixo nivel*/
	private static void lerArquivo(String caminho, Charset c) throws IOException {	
		try (FileInputStream in = new FileInputStream(caminho)){
			byte buffer[] = new byte[1024];
			int read = -1;
			while((read = in.read(buffer)) != -1){
				System.out.println(new String(buffer,0,read, c));
			}
		}
	}

	private static void gravarArquivo(String caminho, Charset c) throws IOException,
			FileNotFoundException {
		String conteudoDoArquivo = "Exemplo de OutPutStream no java (Salvando informações em arquivos)";		
		try (FileOutputStream out = new FileOutputStream(caminho)){
			out.write(conteudoDoArquivo.getBytes(c));	
		};
	}
	
	private static void lerArqComReader(String arq) throws FileNotFoundException, IOException{
		try(BufferedReader buffer = new BufferedReader(new FileReader(arq))){
			String line = null;
			while ((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			
		}
	}
	private static void gravarArqComWriter(String arq, String conteudo) throws IOException{
	    try(BufferedWriter buffer = new BufferedWriter(new FileWriter(arq))){
			buffer.write(conteudo);
		}
	}
}
