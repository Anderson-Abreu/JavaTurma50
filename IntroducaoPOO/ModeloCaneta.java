package IntroducaoPOO;

public class ModeloCaneta {
	
	//ATRIBUTOS -> CARACTERISTICAS
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampa;
	
	
	//METODOS ACESSORES E MODIFICADORES
	
	
		public int getCarga() {
			return carga;
		}

		public String getCor() {
			return cor;
		}

		public void setPonta(double ponta) {
			this.ponta = ponta;
		}

		public void setCarga(int carga) {
			this.carga = carga;
		}

		public double getPonta() {
			return ponta;
		}

		public void setCor(String cor) {
			this.cor = cor;
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
