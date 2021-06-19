package pratica9ex2;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		Divisao divis = new Divisao();
		
		try {
			System.out.println("Digite o 1º número: ");
			divis.setNumerador(input.nextInt());
			
			System.out.println("Digite o 2º número: ");
			divis.setDenominador(input.nextInt());
			
			divis.calculo();
			
			System.out.println("O resultado da divisão é: ");
			
			System.out.println(divis.getResultado());
		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}
	}

}
