/* 3) Em linguagem de programação Java, escreva um algoritmo que determine a situação 

 * de peso de um indivíduo determinada através do IMC (Índice de Massa Corpórea). 
 * O IMC é definido como a relação entre o peso (em kg) e o quadrado da Altura (em m) do indivíduo: 
 * IMC = PESO / ALTURA^2. 
 * A situação do peso é indicada na tabela ao lado:
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		//declaração de variáveis
		double peso, altura, condicao;
		//Entrada de dados
		peso = Double.parseDouble(JOptionPane.showInputDialog("informe seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("informe sua altura: "));
		//Calculo (processamento)
		condicao = (peso) / Math.pow(altura, 2);
		//Saída de dados
		if(condicao <20) {
			JOptionPane.showMessageDialog(null, "Seu IMC é: "+ condicao + " Abaixo do Peso");
		}
		else if(condicao >= 20 && condicao < 25) {
			JOptionPane.showMessageDialog(null,"Seu IMC é: "+ condicao + " Normal");
		}
		else if(condicao >= 25 && condicao < 30) {
			JOptionPane.showMessageDialog(null,"Seu IMC é: "+ condicao + " Sobrepeso");
		}
		else if(condicao >= 30 && condicao < 40) {
			JOptionPane.showMessageDialog(null,"Seu IMC é: "+ condicao + " Obesidade");
		}
		else {
			JOptionPane.showMessageDialog(null,"Seu IMC é: "+ condicao + " Obesidade Mórbida");
		}

	}

}
