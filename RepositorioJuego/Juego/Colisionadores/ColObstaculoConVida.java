package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.Tambor;

public class ColObstaculoConVida extends Colisionador {

	public ColObstaculoConVida(ObstaculoConVida obstaculoConVida) {
		miEntidad = obstaculoConVida;
	}

	@Override
	public void visitar(Aliado a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Enemigo e) {	
	}

	@Override
	public void visitar(DisparoAliado d) {
		
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
	public void visitar(ObstaculoConVida o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ObstaculoTemporal o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		
	}

}
