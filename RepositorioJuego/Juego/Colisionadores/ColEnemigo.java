package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;


public class ColEnemigo extends Colisionador{
	
	public ColEnemigo(Enemigo a) {
		miEntidad=a;
	}
	@Override
	public void visitar(Aliado a) {
		miEntidad.atacar(a);
	}
	@Override
	public void visitar(Enemigo e) {
		e.setPos(e.getPos().x+11, e.getPos().y);
		e.parar();
	}
	@Override
	public void visitar(DisparoAliado d) {	}
	@Override
	public void visitar(DisparoEnemigo d) {	
		d.mover();
	}
	@Override
	public void visitar(PowerUp p) {	}
	
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
