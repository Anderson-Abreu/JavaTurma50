package Introducao;

public class Exemplo3 {
/*
 && -> e
 || -> ou
 */
	
	
	public static void main(String[] args) {
		
		int n = 52;
		
		if(n==5)
		{
			System.out.println("O valor � 5");
		}
		else if(n<5 && n>0)
		{
			System.out.println("O valor � positivo e menor que 5");
		}
		else if(n>5)
		{
			System.out.println("O valor � maior que 5");
		}
		else
		{
			System.out.println("O valor � negativo");
		}
		
		
		System.out.println("FIM DO PROGRAMA");

	}

}
