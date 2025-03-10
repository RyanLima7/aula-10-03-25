package src;

import java.util.Scanner;

public class A_e_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        double A, B;

        System.out.println("Informe o valor de A: ");
        A = sc.nextDouble();

        System.out.println("Informe o valor de B: ");
        B = sc.nextDouble();

        // Troca dos valores
        double temp = A;
        A = B;
        B = temp;

        System.out.println("Após a troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        sc.close();
	        


	}

}
