package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import PowerUps.PowerUp;

public class ColisionadorPowerUp extends Colisionador{
	protected PowerUp power;
	
	public ColisionadorPowerUp(PowerUp p) {
		power=p;
	}
	
	@Override
	public void visitar(Aliado a) {	}

	@Override
	public void visitar(Enemigo e) {	}

	@Override
	public void visitarDisparo(DisparoAliado d) {	}

	@Override
	public void visitarPowerUp(PowerUp p) {	}

	@Override
	public void visitarDisparo(DisparoEnemigo d) {	}
}
