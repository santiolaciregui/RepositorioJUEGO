package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.Obstaculo;
import PowerUps.PowerUp;

public class ColisionadorPowerUp extends Colisionador{
	protected PowerUp power;
	
	public ColisionadorPowerUp(PowerUp p) {
		power=p;
	}
	
	@Override
	public void visitar(Aliado a) {	}

	@Override
	public void visitar(Enemigo e) { e.mover();	}

	@Override
	public void visitar(DisparoAliado d) {
		d.mover();
		
	}

	@Override
	public void visitar(DisparoEnemigo d) {
		d.mover();
		
	}

	@Override
	public void visitar(PowerUp p) {
		p.mover();
		
	}

	@Override
	public void visitar(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
