package Enemigos;

import javax.swing.ImageIcon;

import Armas.ArmaBurns;
import Clases.Enemigo;
import Clases.GameObject;

public class Burns extends Enemigo {
	int contadorDisparo;
	public Burns(int x, int y) {
		super(x, y);
		dano=800;
		vida=2000;
		contadorDisparo=0;
		monedas=1000;
		puntosDeMuerte=2000;
		arma= new ArmaBurns();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsCaminaGif.gif")));
		label.setBounds(x, y,140 , 140);
	}
	
	
	public void mover() {
		super.mover();
		atacar(null);
	}
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaGif.gif")));
		
		contadorDisparo++;
		if(contadorDisparo==27) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), dano));
			contadorDisparo=0;
		}
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsParado.png")));
	
}

	@Override
	public Enemigo crear() {
		return new Burns(0,0);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
}
