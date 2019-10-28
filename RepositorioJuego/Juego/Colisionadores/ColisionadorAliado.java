package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.ObstaculoConVida;
import Obstaculos.ObstaculoTemporal;
import Obstaculos.Tambor;
import PowerUps.PowerUp;

public class ColisionadorAliado extends Colisionador {
	
	public ColisionadorAliado(Aliado a) {
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

}
