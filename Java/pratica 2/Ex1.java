/* 1) Em linguagem de programação Java, escreva um algoritmo que leia os três lados de um triângulo e imprima o tipo de triângulo:
 * a. Equilátero: os três lados são iguais.
 * b. Isósceles: 2 lados são iguais.
 * c. Escaleno: 3 lados diferentes.
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		//declaração de variáveis:
		double lado1, lado2, lado3;
		
		//Entrada de dados:
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("informe o 1º lado: "));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("informe o 2º lado: "));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("informe o 3º lado: "));
		
		//Calculo (processamento):
		if (lado1 == lado2 && lado1 == lado3){
			JOptionPane.showMessageDialog(null,"Três lados iguais, Triangulo Equilátero");
	        }
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			JOptionPane.showMessageDialog(null,"Dois lados são iguais, Triangulo Isósceles");
	        }
		else
	          JOptionPane.showMessageDialog(null, "Três lados diferentes, Triangulo Escaleno");
	        }
		

}
