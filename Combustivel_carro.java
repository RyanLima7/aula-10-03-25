package src;

import java.util.Scanner;

public class Combustivel_carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        double tempo, velocidade, distancia, litrosUsados;

        System.out.println("Informe o tempo gasto na viagem (em horas): ");
        tempo = sc.nextDouble();

        System.out.println("Informe a velocidade média durante a viagem (em km/h): ");
        velocidade = sc.nextDouble();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Quantidade de litros de combustível usados: %.2f litros\n", litrosUsados);
        
        sc.close();

	}

}
