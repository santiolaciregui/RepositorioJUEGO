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
		d.mover();
		
	}
	@Override
	public void visitar(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitar(PowerUp p) {
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
