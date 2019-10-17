package Inteligencias;

import Disparos.DisparoAliado;

public class InteligenciaDisparoAliado extends Inteligencia {
	
	public InteligenciaDisparoAliado(DisparoAliado d) {
		velocidad=2;   
	}
	
	public void mover() {
		pos.setLocation(pos.x + velocidad, pos.y);
	}

}
