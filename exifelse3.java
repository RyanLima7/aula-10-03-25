package src;

import java.util.Scanner;

public class exifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Double num1, num2, num3;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();

		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();

		if (num1 > num2) {
			Double temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 > num3) {
			Double temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num1 > num2) {
			Double temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);

		sc.close();
	}

}
