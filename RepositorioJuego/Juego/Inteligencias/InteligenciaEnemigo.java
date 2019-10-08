package Inteligencias;

import Clases.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		velocidad=2;
	}
	
	public void mover() {
		enemigo.setPos(enemigo.getPos().x - velocidad, enemigo.getPos().y);
	}
}
