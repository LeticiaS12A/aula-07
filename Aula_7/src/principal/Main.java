package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		
		Cachorro Cachorro = new Cachorro();
		Gato Gato = new Gato();
		Vaca Vaca = new Vaca();
		
		System.out.println(Cachorro.emitirSom());
		System.out.println(Gato.emitirSom());
		System.out.println(Vaca.emitirSom());
		
	}

}
