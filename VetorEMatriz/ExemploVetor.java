package VetorEMatriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		int  vet[]= {1,2,3,4,5};//vetor peenchido com valores
		int  vet1[] = new int[5];//vetor vazio
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{	
			System.out.println("Digite um numero: ");
			vet1[x]=ler.nextInt();
		}
		for(int x=0;x<5;x++)
		{
			System.out.print(vet1[x]+"\t");
		}
		
		System.out.println("\n");
		
		for(int x=0;x<5;x++)
		{
			System.out.print(vet[x]+"\t");
		}
		
	}

}
