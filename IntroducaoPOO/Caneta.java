package IntroducaoPOO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {
		
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		ModeloCaneta c1 = new ModeloCaneta();
		ModeloCaneta c2 = new ModeloCaneta();
		ModeloCaneta c3 = new ModeloCaneta();
		
		System.out.println("Digite uma carga: ");
		x=ler.nextInt();
		
		c1.setCarga(x);
		
		c1.setCor("roxa");
		c1.tampar();
		
		System.out.println(c1.getCor());
		
		c1.estado();
		c2.estado();
		c3.estado();
		
	}

}
