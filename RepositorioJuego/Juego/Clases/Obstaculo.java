package Clases;

public abstract class Obstaculo  extends GameObject implements Clonacion<Obstaculo>{
	protected Obstaculo(int x, int y) {
		super(x, y);
	}
	
	public abstract Obstaculo clonar();
}
