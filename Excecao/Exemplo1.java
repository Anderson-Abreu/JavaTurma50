package Excecao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite os n�meros da divis�o: ");
		try {
			n1=ler.nextInt();
			n2=ler.nextInt();
			System.out.println(n1/n2);
		}catch(Exception erro) {
			System.out.println("Voc� cometeu um erro"+erro);
		}
		System.out.println("FIM DO PROGRAMA!!!");
	}

}
