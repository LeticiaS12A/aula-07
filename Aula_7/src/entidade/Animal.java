package entidade;

abstract class Animal {

	String animal;
	String cachorro;
	String gato;
	
	//public int opc() {
	//		if(animal.contains(gato)) {
	//			System.out.println("O som �: ");
	//		}
	//		else if(animal.contains(cachorro)){
	//			System.out.println("O som �: ");
	//		}
	//		else {
	//			System.out.println("O animal � imvalido!!!");
	//		}
	//	}
	
	public String emitirSom() {
		System.out.println("O som �: ");
		return animal;
	}
	
}
