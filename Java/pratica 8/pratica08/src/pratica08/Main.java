package pratica08;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		System.out.println("Quantos veiculos deseja cadastrar: ");
		x = input.nextInt();
		
		Veiculo cadastro[]= new Veiculo[x];
		int i;
		for(i=0; i<x;i++) {
			Veiculo carro = new Veiculo();
			
			System.out.println("Digite o chassi: ");
			carro.setChassi(input.next());
			
			System.out.println("Digite a placa: ");
			carro.setPlaca(input.next());
			
			cadastro[i] = carro;
		}
		
		for(i = 0; i < x; i++) {
			System.out.println("O cadastro de registro número: " + i);
			System.out.println("O chassi do veículo é: " + cadastro[i].getChassi());
			System.out.println("A placa do veículo é: " + cadastro[i].getPlaca());
			System.out.println("====================================");					
		}
		
		System.out.println("fim");		

	}

}
