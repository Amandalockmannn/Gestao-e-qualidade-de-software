/* Em linguagem de programa��o Java, escreva um algoritmo que calcule e apresente a �rea de um losango.

 * As diagonais maior e menor do losango devem ser informadas pelo usu�rio. 
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
		
		JOptionPane.showMessageDialog(null, "�rea: " + area);

	}

}
