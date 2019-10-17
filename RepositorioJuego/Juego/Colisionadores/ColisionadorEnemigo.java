package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;

public class ColisionadorEnemigo extends Colisionador{
	
	public ColisionadorEnemigo(Enemigo a) {
		entidad=a;
	}
	@Override
	public void afectarAliado(Aliado a) {
		a.disminuirVida(entidad.getDano());
	}

	@Override
	public void afectarEnemigo(Enemigo e) {		}

	@Override
	public void afectarDisparoAliado(DisparoAliado d) {  }

	@Override
	public void afectarDisparoEnemigo(DisparoAliado d) {  }

}
