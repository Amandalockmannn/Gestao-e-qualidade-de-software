/* 3) Em linguagem de programa��o Java, escreva um algoritmo que determine a situa��o 

 * de peso de um indiv�duo determinada atrav�s do IMC (�ndice de Massa Corp�rea). 
 * O IMC � definido como a rela��o entre o peso (em kg) e o quadrado da Altura (em m) do indiv�duo: 
 * IMC = PESO / ALTURA^2. 
 * A situa��o do peso � indicada na tabela ao lado:
 */
package pratica02;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		//declara��o de vari�veis
		double peso, altura, condicao;
		//Entrada de dados
		peso = Double.parseDouble(JOptionPane.showInputDialog("informe seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("informe sua altura: "));
		//Calculo (processamento)
		condicao = (peso) / Math.pow(altura, 2);
		//Sa�da de dados
		if(condicao <20) {
			JOptionPane.showMessageDialog(null, "Seu IMC �: "+ condicao + " Abaixo do Peso");
		}
		else if(condicao >= 20 && condicao < 25) {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+ condicao + " Normal");
		}
		else if(condicao >= 25 && condicao < 30) {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+ condicao + " Sobrepeso");
		}
		else if(condicao >= 30 && condicao < 40) {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+ condicao + " Obesidade");
		}
		else {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+ condicao + " Obesidade M�rbida");
		}

	}

}
