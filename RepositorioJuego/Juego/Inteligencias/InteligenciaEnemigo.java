package Inteligencias;

import Clases.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int direccionX, cambioInteligencia;
	
	@SuppressWarnings("deprecation")
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		System.out.println(enemigo.getBounds().x+ "   "+ enemigo.getBounds().y);
		velocidad=3;
	}
	
	public void mover() {
		enemigo.setLocation(pos.x *velocidad/2, pos.y -velocidad);
		if(pos.y<-65)
			pos.y=660;
		if(pos.x<900)
			direccionX=-1;
		if(pos.x>1100)
			direccionX=1;	
	}
}
