package Collection;

import java.util.ArrayList;

public class TesteAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Laço de Repeticao", 50);
		Aula a2 = new Aula("Matrizes", 45);
		Aula a3 = new Aula("POO", 120);
		
		ArrayList<Aula> gen =new ArrayList<>();
		
		gen.add(a1);
		gen.add(a2);
		gen.add(a3);
		
		gen.remove(1);
		
		System.out.println(gen.size());
		
		System.out.println(gen);
		
	}

}
