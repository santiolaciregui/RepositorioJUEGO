package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import PowerUps.PowerUp;

public class ColDisparoEnemigo extends Colisionador{

	public ColDisparoEnemigo(Disparo d) {
		miEntidad=d;
	}

	public void visitar(Aliado j) {
		miEntidad.atacar(j);
	}
	public void visitar(Enemigo e) { }

	@Override
	public void visitarDisparo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}


}
