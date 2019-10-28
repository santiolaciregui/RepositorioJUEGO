package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.ObstaculoConVida;
import Obstaculos.ObstaculoTemporal;
import Obstaculos.Tambor;
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
	public void visitar(ObstaculoConVida o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ObstaculoTemporal o) {
		// TODO Auto-generated method stub
		
	}

}
