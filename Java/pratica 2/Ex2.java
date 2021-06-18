/* Em linguagem de programação Java, 

 * escreva um algoritmo que receba 3 notas no intervalo [0, 10] de um aluno, 
 * calcule e apresente uma mensagem de acordo com sua média:
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		//declaração de variáveis:
		double nota1, nota2, nota3, media;
		
		//Entrada de dados:
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 1ª nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("informe a 2ª nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("informe a 3ª nota: "));
		
		//Calculo (processamento):
		media = (nota1 + nota2 + nota3) /3;
		
		//Saída de dados:
		if (media >= 7 && media <= 10) {
			JOptionPane.showMessageDialog(null,"Sua média foi: "+ media + " Parabéns. Situação: APROVADISSÍMO COM determinação");
        }
		else if (media >= 3 && media < 7) {
			JOptionPane.showMessageDialog(null,"Sua média foi: "+ media + " foi suficiente para o exame. Situação: EXAMINADO");
		}
		else {
			JOptionPane.showMessageDialog(null,"Sua média foi: "+ media + " não foi né... Situação: QUEM SABE NA PRÓXIMA");
		}

	}

}
