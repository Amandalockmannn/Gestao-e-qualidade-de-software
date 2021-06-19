/*
* 2) Em linguagem de programa��o Java, escreva um algoritmo que leia 10 n�meros reais a
* partir do teclado e os armazene em um vetor. O algoritmo deve imprimir o vetor e as
* posi��es do vetor que armazenam n�meros negativos.
* */

package pratica06;

import javax.swing.JOptionPane;

public class Ex2 {
	
	public class Main {
		public void main(String[] args) {
			int index;
			int[] vetor = new int[10];
			String numInt;

			for (index = 0; index < 10; index++) {
				numInt = JOptionPane.showInputDialog("Informe um n�mero inteiro:");
				vetor[index] = Integer.parseInt(numInt);
			}

			numInt = "Vetor informado:\n";
			for (index = 0; index < vetor.length; index++)
				numInt += String.format(" vetor[%d]=%4d\n", index, vetor[index]);
			JOptionPane.showMessageDialog(null, numInt);

			numInt = "Posi��es contendo os negativos:\n";
			for (index = 0; index < vetor.length; index++)
				if (vetor[index] < 0)
					numInt += String.format("%d: vetor[%d] = %d\n", index, index, vetor[index]);
			JOptionPane.showMessageDialog(null, numInt);
		}
	}
}
