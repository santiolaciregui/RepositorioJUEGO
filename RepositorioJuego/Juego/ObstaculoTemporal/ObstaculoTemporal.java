package ObstaculoTemporal;

import Clases.GameObject;
import Clases.Obstaculo;
import Colisionadores.ColObstaculoTemporal;
import Colisionadores.Visitor;

public abstract class ObstaculoTemporal extends Obstaculo {
	protected int duracion;
	
	public ObstaculoTemporal(int x, int y) {
		super(x,y);
		col = new ColObstaculoTemporal(this);
	}

	
	public void mover() {
		vida--;
	}

	@Override
	public void serColisionado(Visitor col) {
		col.visitar(this);
	}

	public void atacar(GameObject e) {
		e.disminuirVida(dano);		
	}

}
