package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;

public class ColDisparoAliado extends Colisionador{
	protected Disparo disparo;
	
	public ColDisparoAliado(Disparo d) {
		disparo=d;
	}
	
	public void afectarAliado(Aliado j) {
		// TODO Auto-generated method stub
		
	}
	public void afectarEnemigo(Enemigo e) {
		disparo.golpearEnemigo(e);
	}

	@Override
	public void afectarDisparoAliado(DisparoAliado d) {
	}

	@Override
	public void afectarDisparoEnemigo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}	
}
