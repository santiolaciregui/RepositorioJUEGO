package Clases;

public abstract class Obstaculo  extends GameObject{
	protected Obstaculo(int x, int y) {
		super(x, y);
	}

	public abstract Obstaculo clonar() ;

}
