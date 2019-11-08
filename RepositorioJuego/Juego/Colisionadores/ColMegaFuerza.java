package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import PowerUps.MegaFuerza;

public class ColMegaFuerza extends Visitor {
	protected MegaFuerza power;
	public ColMegaFuerza(MegaFuerza power) {
		this.power=power;
	}
	@Override
	public void visitar(Aliado a) {	
		power.agregarAMapeo(a);
		a.aumentarDano(power.getMejora());
	}

	@Override
	public void visitar(Enemigo e) {	
	}

	@Override
	public void visitar(DisparoAliado d) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void visitar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		
	}

}
