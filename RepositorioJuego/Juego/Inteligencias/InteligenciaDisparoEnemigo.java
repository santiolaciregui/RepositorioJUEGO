package Inteligencias;

import Disparos.Disparo;

public abstract class InteligenciaDisparoEnemigo extends Inteligencia {
	protected Disparo disparo;
	
	protected InteligenciaDisparoEnemigo(Disparo d) {
		disparo=d;
		velocidad=3;
	}
	
	public void mover() {
		disparo.setPos(disparo.getPos().x - velocidad, disparo.getPos().y);
	}

}