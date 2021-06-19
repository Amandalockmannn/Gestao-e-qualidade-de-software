/*Em linguagem de programação Java, escreva um algoritmo que receba uma temperatura em Celsius, 
 * calcule e mostre essa temperatura em Fahrenheit. 
 * 
 * OBS: F = (C * 1,8) + 32.
 */
package pratica01;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("informe a temperatura em celsius: ")); 
		
		fahrenheit = (celsius * 1.8) + 32;
		
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahrenheit);
	}

}
