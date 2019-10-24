package Clases;
import Armas.Arma;
import Colisionadores.Colisionador;
import Colisionadores.ColisionadorAliado;

public abstract class Aliado extends GameObject {
	protected int monedas;
	protected int precio;
	protected Arma arma;

	protected Aliado(int x,int y) {
		super(x,y);	
		col= new ColisionadorAliado(this);
	}
	
	public void disminuirVida(int valor, int damage) {
		super.disminuirVida(damage);
		monedas=monedas/2;
	}

	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}
	
	@Override
	public abstract void atacar(GameObject e);

	@Override
	public abstract void parar();
	
	public int getMonedas() {
		return monedas;
	}


}
