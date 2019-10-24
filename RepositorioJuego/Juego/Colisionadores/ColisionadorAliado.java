package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;
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
	public void visitarDisparo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

}
