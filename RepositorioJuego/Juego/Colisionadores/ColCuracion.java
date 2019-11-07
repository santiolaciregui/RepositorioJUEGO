package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import PowerUps.Curacion;

public class ColCuracion extends Visitor {
	protected Curacion power;
	public ColCuracion(Curacion power) {
		this.power=power;
	}
	@Override
	public void visitar(Aliado a) {
		a.aumentarVida(power.getMejora());
	}

	@Override
	public void visitar(Enemigo e) {
		// TODO Auto-generated method stub
		
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
