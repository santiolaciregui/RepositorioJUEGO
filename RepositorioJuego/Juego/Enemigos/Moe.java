package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;
import Clases.GameObject;

public class Moe extends Enemigo {

	public Moe(int x, int y) {
		super(x, y);
		dano=500;
		vida=1200;
		monedas=1000;
		puntosDeMuerte=1500;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		int s=  (int) (Math.random() * 50) + 1;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeAtacaGif.gif")));
		if(s==2)
			juego.agregarObjetos(arma.crearDisparo(this.getPos()));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeParado.png")));
		super.parar();
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