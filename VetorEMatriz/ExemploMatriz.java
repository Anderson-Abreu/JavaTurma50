package VetorEMatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int mat[][]= {{1,2},{3,4},{5,6}};
		int m[][] = new int[3][2];
		
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<2;c++)
				System.out.print(mat[l][c]+"\t");
			System.out.println();
		}
		
		System.out.println("\n");		
		
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.print("Digite um numero: ");
				m[l][c]=ler.nextInt();
			}
		}
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<2;c++)
				System.out.print(m[l][c]+"\t");
			System.out.println();
		}
		
	}

}
