package Colisionadores;

import java.util.HashMap;
import java.util.Map;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.ObjetoPrecioso;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.ObstaculoConVida;
import ObstaculoTemporal.ObstaculoTemporal;
import PowerUps.Congelar;
import PowerUps.Curacion;

public class ColCongelar extends Visitor {
	protected Congelar power;
	
	public ColCongelar(Congelar power) {
		this.power=power;
	}
	@Override
	public void visitar(Aliado a) {		
	}

	@Override
	public void visitar(Enemigo e) {
		power.agregarAMapeo(e);
		e.setVelocidad(power.getMejora());		
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
