package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import PowerUps.PowerUp;

public class ColDisparoAliado extends Colisionador{
	
	public ColDisparoAliado(Disparo d) {
		miEntidad=d;
	}
	
	public void visitar(Aliado j) {	}
	
	public void visitar(Enemigo e) {
		miEntidad.atacar(e);
	}

	@Override
	public void visitarDisparo(DisparoAliado d) {  }

	@Override
	public void visitarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarDisparo(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		
	}

}
