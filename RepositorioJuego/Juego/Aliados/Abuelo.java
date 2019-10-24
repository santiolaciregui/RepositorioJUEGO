package Aliados;
import javax.swing.ImageIcon;

import Armas.ArmaAbuelo;
import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;
import Clases.Juego;

public class Abuelo extends Aliado {
	protected int contador;
	public Abuelo(int x, int y) {
		super(x,y);
		vida=2000;
		dano=500;
		precio=3000;
		monedas=precio;
		arma= new ArmaAbuelo();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,127 , 116);
		contador=0;
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}
	
	public void disparar() {
		contador++;
		if(contador==55) {
			juego.agregarDisparo(arma.crearDisparo(this.getPos()));
			contador=0;
		}
	}

	@Override
	public void mover() {	
		disparar();
	}

	@Override
	public void morir() {	
	}
	

}
