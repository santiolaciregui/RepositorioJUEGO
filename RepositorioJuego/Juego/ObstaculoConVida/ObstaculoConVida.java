package ObstaculoConVida;

import Clases.GameObject;
import Clases.Obstaculo;
import Colisionadores.ColObstaculoConVida;
import Colisionadores.Visitor;

public abstract class ObstaculoConVida extends Obstaculo {
	protected int duracion;
	
	public ObstaculoConVida(int x, int y) {
		super(x,y);
		col = new ColObstaculoConVida(this);
	}

	public void disminuirVida(int damage) {
		vida-=damage;
	}

	public void serColisionado(Visitor col) {
		col.visitar(this);
	}
	
	public void atacar(GameObject e) {	}
}
