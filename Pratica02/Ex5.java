/* Em linguagem de programa��o Java, implemente um algoritmo que, informados tr�s valores X, Y e Z, 
 * verifique e informe se eles podem, ou n�o, ser os comprimentos dos lados de um tri�ngulo. 
 * Em um triangulo, cada lado � menor que a soma dos outros dois lados.
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		//declara��o de vari�veis
		double x, y, z;
		
		//Entrada de dados
		x = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro lado: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo lado: "));
		z = Double.parseDouble(JOptionPane.showInputDialog("informe o terceiro lado: "));
		
		//Calculo (processamento)
		if (x < y + z)
			if (y < x + z)
				if (z < x + y)
					JOptionPane.showMessageDialog(null, "Tri�ngulo V�lido");
				else
					JOptionPane.showMessageDialog(null, "Tri�ngulo invalido");
			else
				JOptionPane.showMessageDialog(null, "Tri�ngulo invalido");
		else
			JOptionPane.showMessageDialog(null, "Tri�ngulo invalido");

	}
}
