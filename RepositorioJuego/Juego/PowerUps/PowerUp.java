package PowerUps;

import java.awt.event.MouseListener;

import Clases.GameObject;
import Colisionadores.Colisionador;
import Colisionadores.ColisionadorPowerUp;

public abstract class PowerUp extends GameObject implements MouseListener{
	
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
		col= new ColisionadorPowerUp(this);
		
	}
	public void mover() {	}
	
	@Override
	public void serColisionado(Colisionador col) {	
		col.visitarPowerUp(this);
	}
	
	public void atacar(GameObject a) {	}
	
	public abstract void realizarAccion(GameObject aliado);
	
}