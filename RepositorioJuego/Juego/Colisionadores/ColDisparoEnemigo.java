package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.PowerUp;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.ObstaculoConVida;
import ObstaculoTemporal.ObstaculoTemporal;

public class ColDisparoEnemigo extends Colisionador{

	public ColDisparoEnemigo(Disparo d) {
		miEntidad=d;
	}

	public void visitar(Aliado j) {
		miEntidad.atacar(j);
	}
	public void visitar(Enemigo e) {
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
		miEntidad.atacar(o);
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
