/* 1) Em linguagem de programa��o Java, escreva um algoritmo que leia os tr�s lados de um tri�ngulo e imprima o tipo de tri�ngulo:
 * a. Equil�tero: os tr�s lados s�o iguais.
 * b. Is�sceles: 2 lados s�o iguais.
 * c. Escaleno: 3 lados diferentes.
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		//declara��o de vari�veis:
		double lado1, lado2, lado3;
		
		//Entrada de dados:
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("informe o 1� lado: "));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("informe o 2� lado: "));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("informe o 3� lado: "));
		
		//Calculo (processamento):
		if (lado1 == lado2 && lado1 == lado3){
			JOptionPane.showMessageDialog(null,"Tr�s lados iguais, Triangulo Equil�tero");
	        }
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			JOptionPane.showMessageDialog(null,"Dois lados s�o iguais, Triangulo Is�sceles");
	        }
		else
	          JOptionPane.showMessageDialog(null, "Tr�s lados diferentes, Triangulo Escaleno");
	        }
		

}
