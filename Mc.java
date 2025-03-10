package src;

import java.util.Scanner;

public class Mc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double peso, altura, Imc;

		System.out.println("Me infrome seu peso por favor: ");
		peso = sc.nextDouble();

		System.out.println("Me infrome sua altura por favor: ");
		altura = sc.nextDouble();

		Imc = peso / (altura * altura);

		
		System.out.println("Seu Imc é de: " + String.format("%.2f", Imc) );
		
		 sc.close();

	}

}
