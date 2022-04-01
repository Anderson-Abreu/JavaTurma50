package Introducao;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		String x;
		Scanner ler = new Scanner(System.in);
		System.out.print("digite uma letra: ");
		x=ler.nextLine();
		
		switch (x) 
		{
		case "a":
			System.out.println("vogal");
			break;
		case "e":
			System.out.println("vogal");
			break;
		case "i":
			System.out.println("vogal");
			break;
		case "o":
			System.out.println("vogal");
			break;
		case "u":
			System.out.println("vogal");
			break;

		default:
			System.out.println("Consoante");
			break;
		}
	}

}
