/*4) Em linguagem de programa��o Java, implemente um algoritmo que 
 * retorne o valor da fun��o abaixo ap�s receber um valor qualquer de entrada:
 * f(x) = 2x + 2, para x < - 2.
 * f(x) = 3, para -2<= x < 3.
 * f(x) = -x, para x >= 3.
 * 
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		//declara��o de variaveis
		double x;
		
		//entrada de dados
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x: "));
		
		//c�lculo (processamento):
		if (x < -2)
			JOptionPane.showMessageDialog(null, "f(" + x + ") = " + (2 * x + 2));
		else if (x >= -2 && x < 3)
			JOptionPane.showMessageDialog(null, "f(" + x + ") = " + 3);
		else
			JOptionPane.showMessageDialog(null, "f(" + x + ") = " + (-x));
	}

}
