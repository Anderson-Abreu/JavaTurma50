package IntroducaoPOO;

public class ModeloCaneta {
	
	//ATRIBUTOS -> CARACTERISTICAS
	private String cor;
	public double ponta;
	private int carga;
	public boolean tampa;
	
	//METODO CONSTRUTOR
	
	public ModeloCaneta(String c, double p)
	{
		this.cor=c;
		this.ponta=p;
		this.tampa=true;
		this.carga=100;
	}
	
	
	//METODOS -> COMPORTAMENTOS
	public void escrever()
	{
		if(tampa==true)
			System.out.println("Erro caneta tampada");
		else
			System.out.println("escrevendo...");
	}
	
	public void tampar()
	{
		this.tampa=true;
	}
	
	public void destampar()
	{
		this.tampa=false;
	}
	
	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampa);
		System.out.println("A carga esta em "+this.carga+"%");
	}

}
