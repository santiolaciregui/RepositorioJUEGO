package Clases;
import Colisionadores.ColisionadorAliado;

public abstract class Aliado extends GameObject {
	protected int monedas;
	protected int precio;

	protected Aliado(int x, int y) {
		super(x,y);	
		col= new ColisionadorAliado(this);
	}

	
	public void disminuirValoryVida(int valor, int damage) {
		super.disminuirVida(damage);
		monedas=monedas/2;
		inteligencia.verificarInteligencia();
	}
	@Override
	public void atacar() {}

	@Override
	public void parar() {}

	@Override
	public void golpearJugador(GameObject j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(GameObject e) {
		// TODO Auto-generated method stub
		
	}
	
	public int getMonedas() {
		return monedas;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
	
}
