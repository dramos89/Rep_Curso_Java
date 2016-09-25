package aula1;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args) {
	String input = "1 fish 2 fish red fish blue fish";
    Scanner s = new Scanner(input);
    s.useDelimiter("\\s*fis\\s*");
    System.out.println(s.next());
    System.out.println(s.next());
    System.out.println(s.next());
    System.out.println(s.next());
    s.close();		
	}
}
