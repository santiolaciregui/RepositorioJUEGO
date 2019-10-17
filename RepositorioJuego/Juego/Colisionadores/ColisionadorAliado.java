package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;

public class ColisionadorAliado extends Colisionador {
	
	public ColisionadorAliado(Aliado a) {
		entidad=a;
	}

	@Override
	public void afectarJugador(Aliado a) {	
	}

	@Override
	public void afectarEnemigo(Enemigo e) {
		e.disminuirVida(entidad.getDano());
		e.parar();
	}

	@Override
	public void afectarDisparoAliado(DisparoAliado d) { 
		entidad.golpearDisparo(d);
	}

	@Override
	public void afectarDisparoEnemigo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

}
