package Clases;

public class Enemigo extends GameObject{
	protected int monedas;
	protected int puntaje;
	protected int velocidad;
	
	public Enemigo(int x, int y) {
		super(x,y);
		altura=70;
		ancho=40;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

}
