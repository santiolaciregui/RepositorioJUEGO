package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;

public class ColDisparoEnemigo extends Colisionador{
	protected Disparo disparo;

	public ColDisparoEnemigo(Disparo d) {
		disparo=d;
	}

	public void afectarAliado(Aliado j) {
		disparo.golpearJugador(j);
	}
	public void afectarEnemigo(Enemigo e) { }

	@Override
	public void afectarDisparoAliado(DisparoAliado d) {  }

	@Override
	public void afectarDisparoEnemigo(DisparoAliado d) { }	
}
