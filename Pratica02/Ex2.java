/* Em linguagem de programa��o Java, 

 * escreva um algoritmo que receba 3 notas no intervalo [0, 10] de um aluno, 
 * calcule e apresente uma mensagem de acordo com sua m�dia:
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		//declara��o de vari�veis:
		double nota1, nota2, nota3, media;
		
		//Entrada de dados:
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 1� nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("informe a 2� nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("informe a 3� nota: "));
		
		//Calculo (processamento):
		media = (nota1 + nota2 + nota3) /3;
		
		//Sa�da de dados:
		if (media >= 7 && media <= 10) {
			JOptionPane.showMessageDialog(null,"Sua m�dia foi: "+ media + " Parab�ns. Situa��o: APROVADISS�MO COM determina��o");
        }
		else if (media >= 3 && media < 7) {
			JOptionPane.showMessageDialog(null,"Sua m�dia foi: "+ media + " foi suficiente para o exame. Situa��o: EXAMINADO");
		}
		else {
			JOptionPane.showMessageDialog(null,"Sua m�dia foi: "+ media + " n�o foi n�... Situa��o: QUEM SABE NA PR�XIMA");
		}

	}

}
