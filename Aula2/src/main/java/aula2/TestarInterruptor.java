package aula2;


public class TestarInterruptor {
	public static void main(String[] args) {
		Lampada objLampada = new Lampada("hhh", "hhhh");
		Interruptor objInterruptor = new Interruptor(objLampada);
		objInterruptor.apertar();
		objInterruptor.apertar();
		objInterruptor.apertar();
		objInterruptor.apertar();
		objInterruptor.apertar();
		objInterruptor.apertar();
		objInterruptor.apertar();
	}
}
