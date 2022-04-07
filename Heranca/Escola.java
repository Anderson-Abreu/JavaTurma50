package Heranca;

public class Escola {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		a.setIdade(18);
		p.setSalario(5000.00);
		
		p.nome="Andersno";
		
		p.aumento(1000.00);
		
		System.out.println(p.getNome());
		System.out.println("O salario do professor é: "+p.getSalario());

	}

}
