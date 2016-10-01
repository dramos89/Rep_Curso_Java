package aula3_luna;

import java.util.Random;

public class exemploArray {
	public static void main(String[] args) {
		int[] meuArray = new int[10];
		String[] meuArrayString = new String[10];
		
		for (int i: meuArray){
			System.out.println(meuArray[i]);
		}
		
		for (int i = 0; i< meuArrayString.length; i++){
			System.out.println(meuArrayString[i]);
		}
	}
}
