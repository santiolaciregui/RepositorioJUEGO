package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;

public class ColisionadorEnemigo extends Colisionador{
	
	public ColisionadorEnemigo(Enemigo a) {
		entidad=a;
	}
	@Override
	public void afectarJugador(Aliado a) {
		a.disminuirVida(entidad.getDano());
	}

	@Override
	public void afectarEnemigo(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarDisparoAliado(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarDisparoEnemigo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

}
