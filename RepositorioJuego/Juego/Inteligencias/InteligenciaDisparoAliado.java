package Inteligencias;

import Disparos.DisparoAliado;

public class InteligenciaDisparoAliado extends InteligenciaDisparo {
	
	public InteligenciaDisparoAliado(DisparoAliado d) {
		super(d);
		velocidad=2;   
	}
	
	public void mover() {
		pos.setLocation(pos.x + velocidad, pos.y);
	}

	@Override
	public void parar() {	}
}
