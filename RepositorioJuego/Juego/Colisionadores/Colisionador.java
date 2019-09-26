package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;

public interface Colisionador {
	
	public abstract void afectarJugador(Aliado j);
	public abstract void afectarEnemigo(Enemigo e);
}