/* Em linguagem de programação Java, escreva um algoritmo que calcule e apresente a área de um losango.

 * As diagonais maior e menor do losango devem ser informadas pelo usuário. 
 * OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.
 */ 

package pratica01;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
        double diagonalMaior, diagonalMenor, area;
		
		diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("informe a diagonal maior"));
		diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("informe a diagonal menor"));
		
		area = (diagonalMaior * diagonalMenor) / 2;
		
		JOptionPane.showMessageDialog(null, "Área: " + area);

	}

}
