package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
public class ColObjetoPrecioso extends Colisionador {
	
	public ColObjetoPrecioso(ObjetoPrecioso o) {
		miEntidad = o;
	}

	@Override
	public void visitar(Aliado a) {
		miEntidad.atacar(a);
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
//		miEntidad.mover();		
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