/*1) Em linguagem de programação Java, escreva um algoritmo que leia os elementos de
*	 uma matriz 5 x 5 a partir do teclado. O algoritmo deve:
* 	A) Imprimir a matriz informada.:
*
*	B) Imprimir os elementos armazenados nas posições em que o índice da linha é
*	par e o índice da coluna é ímpar. Exemplo:
*
*	c) Imprimir a matriz transposta a matriz informada. OBS: na matriz transposta,
*	as linhas da matriz tornam-se colunas e as colunas, linhas.
*
* 	D) Trocar os elementos da diagonal principal com os elementos da diagonal
*	secundária. Imprimir a matriz resultante.
*/

package pratica07;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		int linha, coluna;
		int[][] matriz = new int[5][5];
		String finalString;
		
		for (linha = 0; linha < 5; linha++)
			for (coluna = 0; coluna < 5; coluna++) {
				finalString = JOptionPane.showInputDialog("informe um numero inteiro: ");
				matriz[linha][coluna] = Integer.parseInt(finalString);
			}

		imprimir(matriz);
		
		finalString = "Elementos nas posições de linhas pares e colunas ímpares:\n";
		for (linha = 0; linha < 5; linha += 2) {
			for (coluna = 1; coluna < 5; coluna += 2)
				finalString += String.format("%4d", matriz[linha][coluna]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);
		
		finalString = "Matriz Transposta informada:\n";
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 5; coluna++)
				finalString += String.format("%4d", matriz[coluna][linha]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);
		
		for (linha = 0; linha < 5; linha++) {
			int pos = (matriz[linha].length - 1) - linha;
			int temp = matriz[linha][pos];
			matriz[linha][pos] = matriz[linha][linha];
			matriz[linha][linha] = temp;
		}

		imprimir(matriz);

	}

	private static void imprimir(int[][] matriz) {
		int linha, coluna;
		String finalString;
		finalString = "Matriz informada:\n";
		for (linha = 0; linha < 5; linha++) {
			Object[][] mat = null;
			for (coluna = 0; coluna < 5; coluna++)
				finalString += String.format("%4d", mat[linha][coluna]);
			finalString += "\n";
		}
		JOptionPane.showMessageDialog(null, finalString);
		
	}
		
}
	

