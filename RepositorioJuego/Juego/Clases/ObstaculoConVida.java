package Clases;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;
import Colisionadores.Visitor;
import Colisionadores.ColObstaculoConVida;
import Colisionadores.ColObstaculoTemporal;

public abstract class ObstaculoConVida extends GameObject {
	protected int duracion;
	
	public ObstaculoConVida(int x, int y) {
		super(x,y);
		col = new ColObstaculoConVida(this);
	}

	public void recibirDano(int golpe) {
		boolean destruir = false;
		if (vida <= golpe) {
			destruir = true;
		}
		else {
			vida = vida - golpe;
		}
	}
	
	public int getVida() {
		return vida;
	}

	@Override
	public void setVida(int v) {
		vida = v;
	}
	
	public abstract ObstaculoConVida clonar() ;
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	public void disminuirVida(int valor, int damage) {
		super.disminuirVida(damage);
		monedas=monedas/2;
	}

	public void serColisionado(Visitor col) {
		col.visitar(this);
	}
	

}
