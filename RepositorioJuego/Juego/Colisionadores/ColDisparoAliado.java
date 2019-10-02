package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;

public class ColDisparoAliado implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoAliado(Disparo d) {
		disparo=d;
	}
	
	public void afectarJugador(Aliado j) {
		// TODO Auto-generated method stub
		
	}
	public void afectarEnemigo(Enemigo e) {
		disparo.golpearEnemigo(e);
	}	
}
