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
