/*Em linguagem de programa��o Java, escreva um algoritmo que receba os 

 * valores dos dois catetos de um tri�ngulo, calcule e apresente o valor da hipotenusa. 
 * 
 * OBS - Teorema de Pit�goras: a^2 = b^2 + c^2.
 */
package pratica01;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		double catetoA, catetoB, hipotenusa;
		
		catetoA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro cateto: "));
		catetoB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo cateto: "));
		
		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		/*square root
		 * raiz quadrada
		 * 
		 */

		JOptionPane.showMessageDialog(null, "valor da hipotenusa �: " + hipotenusa);

	}

}
