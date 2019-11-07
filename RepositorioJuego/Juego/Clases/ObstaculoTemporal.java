package Clases;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculoTemporal;
import Colisionadores.Colisionador;
import Colisionadores.Visitor;

public abstract class ObstaculoTemporal extends GameObject {
	protected int duracion;
	
	public ObstaculoTemporal(int x, int y) {
		super(x,y);
		col = new ColObstaculoTemporal(this);
	}

	
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	public void mover() {
		vida--;
	}

	@Override
	public void serColisionado(Visitor col) {
		col.visitar(this);
		
	}
	public int getTiempo() {
		return duracion;
	}

	public void setTiempo(int t) {
		// TODO Auto-generated method stub
		
	}

	public void aplicarEfecto(GameObject e) {
		// TODO Auto-generated method stub
		
	}

	public void terminar() {
		// TODO Auto-generated method stub
		
	}


	public void atacar(GameObject e) {
		e.disminuirVida(dano);		
	}

}
