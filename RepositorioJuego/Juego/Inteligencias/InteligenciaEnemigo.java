package Inteligencias;

import Clases.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		velocidad=1;
	}
	
	public void mover() {
		enemigo.mover(velocidad);
	}
}
