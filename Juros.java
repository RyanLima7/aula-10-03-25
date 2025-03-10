package src;

import java.util.Scanner;

public class Juros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		  Scanner sc = new Scanner(System.in);

	        double valor, taxa, tempo, prestacao;

	        System.out.println("Informe o valor do produto: ");
	        valor = sc.nextDouble();

	        System.out.println("Informe a taxa de juros (%): ");
	        taxa = sc.nextDouble();

	        System.out.println("Informe o tempo em meses de atraso: ");
	        tempo = sc.nextDouble();

	        prestacao = valor + (valor * (taxa / 100) * tempo);

	        System.out.printf("O valor da prestação em atraso é: %.2f\n", prestacao);

	        sc.close();
	}

}
