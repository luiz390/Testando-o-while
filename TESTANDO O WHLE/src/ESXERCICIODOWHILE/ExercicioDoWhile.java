package ESXERCICIODOWHILE;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x ;
		int soma = 0;
	    System.out.println("digite um numero");
	    x = sc.nextInt();
		
		while(x != 0) {
			soma = soma + x;
			 x = sc.nextInt();
		}
		
	    System.out.println("o valor e" + soma);
		
		
		sc.close();

	}

}
