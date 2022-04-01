package Introducao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2=ler.nextInt();
		
		System.out.println("A soma é "+ (n1+n2));
		System.out.println("A subtraçao é "+ (n1-n2));
		System.out.println("A multiplicacao é "+ n1*n2);
		System.out.println("A divisão é "+ n1/n2);
	}

}
