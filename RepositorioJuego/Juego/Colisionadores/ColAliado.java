package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;

public class ColAliado extends Colisionador {
	
	public ColAliado(Aliado a) {
		miEntidad=a;
	}
	@Override
	public void visitar(Aliado a) {	
	}
	@Override
	public void visitar(Enemigo e) {
		miEntidad.atacar(e);
	}
	@Override
	public void visitar(DisparoAliado d) {		
	}
	@Override
	public void visitar(DisparoEnemigo d) {		
	}
	@Override
	public void visitar(PowerUp p) {
	}
	@Override
	public void visitar(ObstaculoConVida o) {	}
	@Override
	public void visitar(ObstaculoTemporal o) {	}
	@Override
	public void visitar(ObjetoPrecioso o) {
		miEntidad.mover();
	}

}
