package testeoDePatronesAgus;

public class tester {
	public static void main(String[] args) {
		/*
		 * getInstance es un metodo estatico (de la clase), por lo que debe serle pedido a la clase
		 * y no a un objeto en particular.
		 */
		Singleton a = Singleton.getInstance();
	}
}
