package src;

import java.util.Scanner;

public class volume_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        double comprimento, largura, altura, volume;

        System.out.println("Informe o comprimento da caixa: ");
        comprimento = sc.nextDouble();

        System.out.println("Informe a largura da caixa: ");
        largura = sc.nextDouble();

        System.out.println("Informe a altura da caixa: ");
        altura = sc.nextDouble();

        // Calcula o volume
        volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa retangular é: %.2f\n", volume);

        sc.close();

	}

}
