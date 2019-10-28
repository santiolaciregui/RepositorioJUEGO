package Enemigos;

import javax.swing.ImageIcon;

import Armas.ArmaMoe;
import Clases.Enemigo;
import Clases.GameObject;

public class Moe extends Enemigo {
	int contadorDisparo;
	public Moe(int x, int y) {
		super(x, y);
		dano=500;
		vida=1200;
		monedas=1000;
		puntosDeMuerte=1500;
		contadorDisparo=0;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
		arma = new ArmaMoe();
	}
	
	public void mover() {
		super.mover();
		atacar(null);
	}
	public void atacar(GameObject e) {
		
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeAtacaGif.gif")));
		contadorDisparo++;
		if(contadorDisparo==15) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), dano));
			contadorDisparo=0;
		}
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeParado.png")));
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	

}