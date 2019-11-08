package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Marge extends Aliado {

	public Marge(int x, int y) {
		super(x,y);
		vida=2000;
		dano=200;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParada.png")));
		label.setBounds(x, y,117 , 110);
		precio = 1000;
		monedas = precio;
	}
	
	public void atacarNormalGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararNormalGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void mover() {	
//		estado.parar();
	}
	
	public void atacarSuperPoderosoGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararSuperPoderosoGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}
}
