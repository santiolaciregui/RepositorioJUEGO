package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;

public class ColDisparoAliado extends Colisionador{
	
	public ColDisparoAliado(Disparo d) {
		miEntidad=d;
	}
	
	public void visitar(Aliado j) {
		miEntidad.mover();
	}
	
	public void visitar(Enemigo e) {
		miEntidad.atacar(e);
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
