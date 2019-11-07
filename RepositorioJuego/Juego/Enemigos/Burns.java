package Enemigos;

import java.util.Random;

import javax.swing.ImageIcon;

import Armas.ArmaBurns;
import Clases.Enemigo;
import Clases.GameObject;
import Estados.Normal;
import Estados.SuperPoderoso;
import Estados.Estado;

public class Burns extends Enemigo {
	protected int contadorDisparo;
	protected Estado estado;
	public Burns(int x, int y) {
		super(x, y);
		dano=800;
		contadorDisparo=0;
		monedas=1000;
		puntosDeMuerte=2000;
		arma= new ArmaBurns();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsCaminaGif.gif")));
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
	public Enemigo clonar() {
		return new Burns(0,0);
	}

	@Override
	public void cambiarLabel() {
		if(vida>1500)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaMejoradoGif.gif")));
		else
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BurnsAtacaGif.gif")));
	}
	
	private void enemigoAleatorio() {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(20-1+1) + 1;
		if(n==0) {
			this.setEstado(new Normal(this));
			this.vida=2000;
		}
		else {
			this.setEstado(new SuperPoderoso(this));
			this.vida=1700;
		}
	}
}
