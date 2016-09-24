package aula2;

public class Ponto {
	double x;
	double y;

	public Ponto(double coordX, double coordY){
		x = coordX;
		y = coordY;
	}
	
	/**
	 * 
	 * @param deltaX
	 * @param deltaY
	 */
	public void deslocar(double deltaX, double deltaY){
		x+= deltaX;
		y+= deltaY;
	}
	
	public void zerar(){
		x = 0;
		y = 0;
	}
	
	public boolean isXMenorQueZero(){
		return x < 0;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isYMenorQueZero(){
		if (y < 0)
			return true;
		return false;
	}
}
