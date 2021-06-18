/* 7) Em linguagem de programação Java, escreva um algoritmo que informe o preço dos produtos de uma loja, 
 * conforme indicado na tabela abaixo. O algoritmo deve receber o código do produto como entrada.
 * 
 * //declarando as variaveis
		//Entrada de dados
		//Calculo (processamento)
		//Saída de dados

 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		//declarando as variaveis
		int codigo;
		
		//Entrada de dados
		codigo = Integer.parseInt(JOptionPane.showInputDialog("informe o codigo do produto: "));
		
		switch(codigo) {
		case 1:
			JOptionPane.showMessageDialog(null, "Sapato: R$ 99,99.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Bolsa: R$ 103,89.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Camisa: R$ 49,98.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Calça: R$ 89,72.");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Blusa: R$ 97,35.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Codigo invalido");
		}
		
		//Calculo (processamento)
		//Saída de dados

	}

}
