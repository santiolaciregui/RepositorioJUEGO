package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		vida=2000;
		dano=70;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
		label.setBounds(x, y,117 , 110);
		precio = 1000;
		monedas = precio;
	}
	
	public void atacarNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
	}
	
	public void pararNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
	}

	@Override
	public void mover() {	
		estado.parar();
	}
	
	public void atacarSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaMejoradaGif.gif")));
	}
	
	public void pararSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParadaMejorada.png")));
	}
}
