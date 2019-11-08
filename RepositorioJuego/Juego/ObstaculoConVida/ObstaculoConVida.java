package ObstaculoConVida;

import Clases.Obstaculo;
import Colisionadores.ColObstaculoConVida;
import Colisionadores.Visitor;

public abstract class ObstaculoConVida extends Obstaculo {
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

	public void disminuirVida(int valor, int damage) {
		super.disminuirVida(damage);
		monedas=monedas/2;
	}

	public void serColisionado(Visitor col) {
		col.visitar(this);
	}
}
