/* Em linguagem de programação Java, implemente um algoritmo que, informados três valores X, Y e Z, 
 * verifique e informe se eles podem, ou não, ser os comprimentos dos lados de um triângulo. 
 * Em um triangulo, cada lado é menor que a soma dos outros dois lados.
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		//declaração de variáveis
		double x, y, z;
		
		//Entrada de dados
		x = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro lado: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo lado: "));
		z = Double.parseDouble(JOptionPane.showInputDialog("informe o terceiro lado: "));
		
		//Calculo (processamento)
		if (x < y + z)
			if (y < x + z)
				if (z < x + y)
					JOptionPane.showMessageDialog(null, "Triângulo Válido");
				else
					JOptionPane.showMessageDialog(null, "Triângulo invalido");
			else
				JOptionPane.showMessageDialog(null, "Triângulo invalido");
		else
			JOptionPane.showMessageDialog(null, "Triângulo invalido");

	}
}
