package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.ObstaculoConVida;
import Obstaculos.ObstaculoTemporal;
import Obstaculos.Tambor;
import PowerUps.PowerUp;

public class ColisionadorObstaculoConVida extends Colisionador {

	@Override
	public void visitar(Aliado a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Enemigo e) {
		e.parar();
		
	}

	@Override
	public void visitar(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(PowerUp p) {
		// TODO Auto-generated method stub
		
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
