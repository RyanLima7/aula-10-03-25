package src;

import java.util.Scanner;

public class Oleo_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double volume, altura, raio;

        // Solicita os valores do raio e altura
        System.out.println("Informe o valor do raio da lata de óleo: ");
        raio = sc.nextDouble();
        
        System.out.println("Informe o valor da altura da lata de óleo: ");
        altura = sc.nextDouble();

        // Calcula o volume da lata de óleo
        volume = 3.14159 * Math.pow(raio, 2) * altura;

        // Apresenta o resultado formatado
        System.out.printf("O volume da lata de óleo é: %.2f\n", volume);
        
        sc.close();

	}

}
