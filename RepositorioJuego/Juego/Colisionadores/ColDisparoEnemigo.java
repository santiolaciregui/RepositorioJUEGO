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
import ObstaculoConVida.Tambor;

public class ColDisparoEnemigo extends Colisionador{

	public ColDisparoEnemigo(Disparo d) {
		miEntidad=d;
	}

	public void visitar(Aliado j) {
		miEntidad.atacar(j);
	}
	public void visitar(Enemigo e) { 
		e.mover();
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
