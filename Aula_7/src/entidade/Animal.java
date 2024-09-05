package entidade;

abstract class Animal {

	String animal;
	String cachorro;
	String gato;
	
	//public int opc() {
	//		if(animal.contains(gato)) {
	//			System.out.println("O som é: ");
	//		}
	//		else if(animal.contains(cachorro)){
	//			System.out.println("O som é: ");
	//		}
	//		else {
	//			System.out.println("O animal é imvalido!!!");
	//		}
	//	}
	
	public String emitirSom() {
		System.out.println("O som é: ");
		return animal;
	}
	
}
