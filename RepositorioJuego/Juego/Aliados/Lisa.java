package Aliados;

import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Lisa extends Aliado {

	public Lisa(int x, int y) {
		super(x,y);
		dano=100;
		vida=700;
		precio=800;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParada.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaAtacaGif.gif")));
	}
	
	public void pararNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParada.png")));
	}

	@Override
	public void mover() {	
		estado.parar();
	}
	
	public void atacarSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaAtacaMejoradaGif.gif")));
	}
	
	public void pararSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParadaMejorada.png")));
	}
}
