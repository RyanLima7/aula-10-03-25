package src;

import java.util.Scanner;

public class Conversao_graus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

       
        double grausFahrenheit, grausCelsius, resultado;

        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        grausFahrenheit = sc.nextDouble();

      
        grausCelsius = ((grausFahrenheit - 32) * 5) / 9;

     
        System.out.printf("A temperatura convertida para Celsius é: %.2f°C\n", grausCelsius);

        sc.close();

	}

}
