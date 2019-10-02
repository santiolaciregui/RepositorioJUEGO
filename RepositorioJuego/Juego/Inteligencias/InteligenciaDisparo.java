package Inteligencias;

import Disparos.Disparo;

public abstract class InteligenciaDisparo extends Inteligencia {
	protected Disparo disparo;
	
	protected InteligenciaDisparo(Disparo d) {
		disparo=d;
	}

}