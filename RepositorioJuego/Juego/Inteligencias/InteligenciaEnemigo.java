package Inteligencias;

import Clases.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
//		System.out.println(enemigo.getBounds().x+ "   "+ enemigo.getBounds().y);
		velocidad=3;
	}
	
	public void mover() {
//		enemigo.setLocation(pos.x *velocidad/2, pos.y);
		enemigo.setBounds(enemigo.getBounds().x - velocidad, enemigo.getBounds().y, enemigo.getBounds().width, enemigo.getBounds().height);
	}
}
