package aula4.exercicioanimais;

public class Veterinario extends Humano{
	public void examinar(Examinavel... animais){
		for (Examinavel animal : animais){
			animal.emitirSom();
		}
	}
}
