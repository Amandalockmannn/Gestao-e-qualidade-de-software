package pratica9ex2;

import java.util.Scanner;

public class Divisao {
	Scanner input = new Scanner(System.in);
	int numerador, denominador;
	int resultado;
	
	public int getNumerador() {
		return this.numerador;
	}
	
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public int getDenominador() {
		return this.denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public int getResultado() {
		return this.resultado;
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public void calculo() {
		if(this.denominador > 0 && this.denominador <10)
		{
			throw new ArithmeticException("O divisor não pode ser menor que 10");
		}
		this.resultado = this.getNumerador() / this.getDenominador();
	}

}
