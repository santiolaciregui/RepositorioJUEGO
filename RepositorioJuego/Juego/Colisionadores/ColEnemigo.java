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

public class ColEnemigo extends Colisionador{
	
	public ColEnemigo(Enemigo a) {
		miEntidad=a;
	}
	@Override
	public void visitar(Aliado a) {
		miEntidad.atacar(a);
	}
	@Override
	public void visitar(Enemigo e) {}
	@Override
	public void visitar(DisparoAliado d) {
		// TODO Auto-generated method stub
		
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
		miEntidad.atacar(o);
	}
	@Override
	public void visitar(ObstaculoTemporal o) {
	}
	@Override
	public void visitar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		
	}
		
}
