/*
*3) Em linguagem de programação Java, escreva um algoritmo que leia 10 números reais a
* partir do teclado e os armazene em um vetor. O algoritmo deve imprimir o vetor, o
* menor e o maior número informado.
*/

package pratica06;

import javax.swing.JOptionPane;

public class Ex3 {
	public static void main(String[] args) {
		int index, menor, maior;
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
		
		menor = vetor[0];
		maior = vetor[0];
		for (index = 1; index < vetor.length; index++) {
			if (vetor[index] < menor) {
				menor = vetor[index];
			} else {
				for (index = 1; index < vetor.length; index++) {
					if (vetor[index] > maior) {
						maior = vetor[index];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Menor valor informado: " + menor);
		JOptionPane.showMessageDialog(null, "Maior valor informado: " + maior);
	}




}
