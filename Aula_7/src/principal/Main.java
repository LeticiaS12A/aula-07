package principal;

import java.util.Scanner;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

abstract class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Cachorro Cachorro = new Cachorro();
		Gato Gato = new Gato();
		Vaca Vaca = new Vaca();
		
		System.out.println(Cachorro.emitirSom());
		System.out.println(Gato.emitirSom());
		System.out.println(Vaca.emitirSom());
		
		
	}

}
