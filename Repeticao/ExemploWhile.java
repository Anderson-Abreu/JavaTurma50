package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		int n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n1=ler.nextInt();
		System.out.println("Digite outro numero: ");
		n2=ler.nextInt();
		while(n2!=0)
		{
			System.out.println("A divisao é: "+n1+n2);
			System.out.println("Digite um numero: ");
			n1=ler.nextInt();
			System.out.println("Digite outro numero: ");
			n2=ler.nextInt();
		}
		System.out.println("Erro não é possível dividir por 0");
	}

}
