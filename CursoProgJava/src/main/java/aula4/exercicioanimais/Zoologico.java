package aula4.exercicioanimais;

public class Zoologico {
	public static void main(String[] args) {
		Examinavel jacare = new Jacare();
		Examinavel jacarethias = new Jacarethias();
		Examinavel baleia = new Baleia();
		Veterinario drTommy = new Veterinario();
		
		drTommy.examinar(jacare, baleia, jacare, jacarethias);
	}
}
