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
			System.out.println("O valor é 5");
		}
		else if(n<5 && n>0)
		{
			System.out.println("O valor é positivo e menor que 5");
		}
		else if(n>5)
		{
			System.out.println("O valor é maior que 5");
		}
		else
		{
			System.out.println("O valor é negativo");
		}
		
		
		System.out.println("FIM DO PROGRAMA");

	}

}
