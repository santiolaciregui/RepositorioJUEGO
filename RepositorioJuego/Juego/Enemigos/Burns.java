package Enemigos;

import java.util.Random;

import javax.swing.ImageIcon;

import Armas.ArmaBurns;
import Clases.Enemigo;
import Clases.GameObject;
import Estados.EnemigoNormal;
import Estados.EnemigoSuperPoderoso;
import Estados.Estado;

public class Burns extends Enemigo {
	protected int contadorDisparo;
	protected Estado estado;
	public Burns(int x, int y) {
		super(x, y);
		dano=800;
		contadorDisparo=0;
		monedas=1000;
		arma= new ArmaBurns();
		label.setBounds(x, y,140 , 140);
		enemigoAleatorio();		
	}
	
	public void mover() {
		super.mover();
		atacar(null);
	}
	public void atacar(GameObject e) {
		cambiarLabel();
		contadorDisparo++;
		if(contadorDisparo==50) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), dano));
			contadorDisparo=0;
		}
	}
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsParado.png")));
	}

	@Override
	public void cambiarLabel() {
		if(vida>2000)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaMejoradoGif.gif")));
		else
			if(vida<=2000)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaGif.gif")));
	}
	
	@Override
	public Enemigo clonar() {
		Enemigo clone= new Burns(0,0);
		return clone;
	}
}
