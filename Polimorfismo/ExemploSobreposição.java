package Polimorfismo;

public class ExemploSobreposição {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		Cavalo c = new Cavalo();
		
		dog.emitirSom();
		cat.emitirSom();
		c.emitirSom();

	}

}
