package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.ObstaculoConVida;
import ObstaculoTemporal.ObstaculoTemporal;

public class ColObstaculoTemporal extends Colisionador{
	
	public ColObstaculoTemporal(ObstaculoTemporal o) {
		miEntidad = o ;
	}
	@Override
	public void visitar(Aliado a) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(Enemigo e) {
		miEntidad.atacar(e);
		miEntidad.mover();
	}

	@Override
	public void visitar(DisparoAliado d) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(DisparoEnemigo d) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(PowerUp p) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(ObstaculoConVida o) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(ObstaculoTemporal o) {
		miEntidad.mover();
		
	}

	@Override
	public void visitar(ObjetoPrecioso o) {
		miEntidad.mover();
		
	}

}
