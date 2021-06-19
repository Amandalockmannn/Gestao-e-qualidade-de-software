/* Em linguagem de programação Java, escreva um algoritmo que receba o raio, calcule e apresente:

 * a. O comprimento de uma esfera: C = 2 * π * R.
 * b. A área de uma esfera: A = π * R^2
 * c. O volume de uma esfera: V = ¾ * π * R^3.
 * 
 * declarar volume inteiro por causa do 3/4 (1.75) colocando "(double)" na frente ou "3.0 / 4.0" ou 1.75"
 */
package pratica01;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		//declaração de variáveis:
		double raio, comprimentoDouble, areaDouble, volumeDouble;
		String comprimentoString, areaString, volumeString;
		
		//Entrada de dados:
		raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio: "));
		
		//Calculo (processamento):
		comprimentoDouble = 2 * Math.PI * raio;
		areaDouble = Math.PI * Math.pow(raio, 2);
		volumeDouble = (double) 3 / 4 * Math.PI * Math.pow(raio, 3);
		
		//Conversão de tipo:
		comprimentoString = String.format("%.2f", comprimentoDouble);
		areaString = String.format("%.2f", areaDouble);
		volumeString = String.format("%.2f", volumeDouble);
		
		//Saída de dados:
		JOptionPane.showMessageDialog(null, "Comprimento: " + comprimentoString + "\n Área: " + areaString + "\n Volume: " + volumeString);
		
	}

}
