package Sobrecarga;

public class ModeloSobrecarga {
	
	private double calc;

	public double soma(int n1, int n2)
	{
		this.calc=n1+n2;
		return this.calc;
	}
	
	public double soma(int n1, int n2, int n3)
	{
		this.calc=n1+n2+n3;
		return this.calc;
	}
	
	public double soma(double n1, double n2)
	{
		this.calc=n1+n2;
		return this.calc;
	}
}
