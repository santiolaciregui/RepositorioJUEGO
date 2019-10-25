package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.Obstaculo;
import PowerUps.PowerUp;

public class ColDisparoAliado extends Colisionador{
	
	public ColDisparoAliado(Disparo d) {
		miEntidad=d;
	}
	
	public void visitar(Aliado j) {	}
	
	public void visitar(Enemigo e) {
		miEntidad.atacar(e);
	}


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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

}
