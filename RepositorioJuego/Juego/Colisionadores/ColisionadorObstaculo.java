package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.Obstaculo;
import PowerUps.PowerUp;

public class ColisionadorObstaculo extends Colisionador {

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
	public void visitar(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
