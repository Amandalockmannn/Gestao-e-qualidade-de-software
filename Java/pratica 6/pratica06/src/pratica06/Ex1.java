/*
* 1) Em linguagem de programação Java, escreva um algoritmo que leia 10 números inteiros
* a partir do teclado e os armazene em um vetor. O algoritmo deve imprimir o vetor e
* apresentar a soma dos números pares.
* 
* */

package pratica06;

import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int index, soma = 0;
		int[] vetor = new int[10];
		String numInt;
		
		for (index = 0; index < 10; index++) {
			numInt = JOptionPane.showInputDialog("Informe um número inteiro:");
			vetor[index] = Integer.parseInt(numInt);
	}
		numInt = "Vetor informado:\n";
		for (index = 0; index < vetor.length; index++)
			numInt += String.format(" vetor[%d]=%4d\n", index, vetor[index]);
		JOptionPane.showMessageDialog(null, numInt);
		
		for (int numPar : vetor)
			if (numPar % 2 == 0)
				soma += numPar;
		JOptionPane.showMessageDialog(null, "Soma dos números pares do vetor: " + soma);
	}

}
