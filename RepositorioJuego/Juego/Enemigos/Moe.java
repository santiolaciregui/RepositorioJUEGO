package Enemigos;

import javax.swing.ImageIcon;

import Armas.ArmaMoe;
import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Estados.EnemigoNormal;

public class Moe extends Enemigo {
	int contadorDisparo;
	public Moe(int x, int y) {
		super(x, y);
		dano=100;
		vida=1200;
		monedas=1000;
		puntosDeMuerte=1500;
		contadorDisparo=0;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
		arma = new ArmaMoe();
		estado= new EnemigoNormal(this);
	}
	
	public void mover() {
		atacar(null);
		super.mover();
	}
	public void atacar(Aliado e) {
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
		return new Moe(0,0);
	}

	@Override
	public void cambiarLabel() {	}	

}