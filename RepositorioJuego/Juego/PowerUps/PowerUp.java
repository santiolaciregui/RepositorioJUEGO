package PowerUps;

import java.awt.event.MouseListener;

import Clases.GameObject;
import Colisionadores.Colisionador;

public abstract class PowerUp extends GameObject implements MouseListener{
	protected GameObject aliado;
	
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
		
	}
	public void mover() {	}
	
	@Override
	public void serColisionado(Colisionador col) {	
		col.visitarPowerUp(this);
	}
	
	public void golpearJugador(GameObject a) {
		this.realizarAccion(a);
		this.vida=0;
	}
	
	public abstract void realizarAccion(GameObject aliado);
	
}