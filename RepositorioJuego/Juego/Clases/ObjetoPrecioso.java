package Clases;

import Colisionadores.Visitor;
import Colisionadores.ColObjetoPrecioso;

public class ObjetoPrecioso extends GameObject {

	public ObjetoPrecioso(int x, int y) {
		super(x,y);
		col= new ColObjetoPrecioso(this);
	}

	public void atacar(GameObject e) {
		if (vida<13)
			e.disminuirVida(dano);
	}

	@Override
	public void mover() {
		vida--;		
	}
	public void serColisionado(Visitor col) {
		col.visitar(this);
	}


}
