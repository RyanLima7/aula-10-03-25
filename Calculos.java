package src;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        int A, B, C, D;

	        System.out.println("Informe o valor de A: ");
	        A = sc.nextInt();

	        System.out.println("Informe o valor de B: ");
	        B = sc.nextInt();

	        System.out.println("Informe o valor de C: ");
	        C = sc.nextInt();

	        System.out.println("Informe o valor de D: ");
	        D = sc.nextInt();

	        // Adições
	        System.out.println("Adições:");
	        System.out.println("A + B = " + (A + B));
	        System.out.println("A + C = " + (A + C));
	        System.out.println("A + D = " + (A + D));
	        System.out.println("B + C = " + (B + C));
	        System.out.println("B + D = " + (B + D));
	        System.out.println("C + D = " + (C + D));

	        // Multiplicações
	        System.out.println("Multiplicações:");
	        System.out.println("A * B = " + (A * B));
	        System.out.println("A * C = " + (A * C));
	        System.out.println("A * D = " + (A * D));
	        System.out.println("B * C = " + (B * C));
	        System.out.println("B * D = " + (B * D));
	        System.out.println("C * D = " + (C * D));

	        sc.close();

	}

}
