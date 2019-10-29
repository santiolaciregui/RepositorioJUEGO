package Clases;

import Colisionadores.Colisionador;
import Colisionadores.ColEnemigo;
import Colisionadores.ColObjetoPrecioso;

public class ObjetoPrecioso extends GameObject {

	public ObjetoPrecioso(int x, int y) {
		super(x,y);
		col= new ColObjetoPrecioso(this);
	}

	@Override
	public void atacar(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}