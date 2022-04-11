package Encapsulamento;

public class ModeloRadio implements Radio {

	private boolean ligado;
	private int vol;
	
	
	public boolean getLigado() {
		return ligado;
	}

	public int getVol() {
		return vol;
	}

	@Override
	public void ligar() {
		this.ligado=true;
		
	}

	@Override
	public void desligar() {
		this.ligado=false;
		
	}

	@Override
	public void maisVol() {
		this.vol++;
		
	}

	@Override
	public void menosVol() {
		this.vol--;
		
	}

	@Override
	public void mudo() {
		this.vol=0;
		
	}

	@Override
	public void trocaEstacao() {
		System.out.println("Trocando a estação");
		
	}

}
