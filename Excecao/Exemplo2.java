package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite os n�meros da divis�o: ");
		try {
			n1=ler.nextInt();
			n2=ler.nextInt();
			System.out.println(n1/n2);
		}catch(ArithmeticException erro) {
			System.out.println("Erro n�o � poss�vel divisao por ZERO"+erro);
		}catch(InputMismatchException erro) {
			System.out.println("Valor inv�lido, digite um n�mero inteiro");
		}
		System.out.println("FIM DO PROGRAMA!!!");

	}

}
