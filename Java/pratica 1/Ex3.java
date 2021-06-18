/*Em linguagem de programação Java, escreva um algoritmo que receba o valor 
 * do salário mínimo e o valor do salário de um funcionário. 
 * O algoritmo deve calcular e apresentar a quantidade de salários mínimos que esse funcionário recebe.
 */
package pratica01;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
        double salarioMinimo, salarioFuncionario, quantidade;
		
		salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("informe o salário Mínimo: "));
		salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("informe o salário de um funcionário: "));
		quantidade = salarioFuncionario / salarioMinimo;
		
		JOptionPane.showMessageDialog(null, "A quantidade de Salário Mínimo que esse funcionario recebe é: " + quantidade);

	}

}
