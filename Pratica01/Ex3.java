/*Em linguagem de programa��o Java, escreva um algoritmo que receba o valor 
 * do sal�rio m�nimo e o valor do sal�rio de um funcion�rio. 
 * O algoritmo deve calcular e apresentar a quantidade de sal�rios m�nimos que esse funcion�rio recebe.
 */
package pratica01;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
        double salarioMinimo, salarioFuncionario, quantidade;
		
		salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("informe o sal�rio M�nimo: "));
		salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("informe o sal�rio de um funcion�rio: "));
		quantidade = salarioFuncionario / salarioMinimo;
		
		JOptionPane.showMessageDialog(null, "A quantidade de Sal�rio M�nimo que esse funcionario recebe �: " + quantidade);

	}

}
