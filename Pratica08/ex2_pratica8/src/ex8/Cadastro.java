package ex8;

import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
    public static void main (String[] args){
    	
	try (Scanner ler = new Scanner(System.in)) {
		System.out.println("Quantos cadastros deseja fazer?: ");
		int n = ler.nextInt();	

		int v[] = new int[n]; // declara��o e aloca��o de espa�o para o vetor "v"
		int i; // �ndice ou posi��o

		// processando os "n" elementos do vetor "v"
		for (i=0; i<n; i++) {
			  v[i] = i; // na i-�sima posi��o do vetor "v" armazena o valor da vari�vel "i"
		
		      System.out.println("CPF: ");
		      String CPF = ler.nextLine();
		
		      System.out.println("CNPJ: ");
		      String CNPJ = ler.nextLine();
			}
	}
    }
}