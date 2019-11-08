package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		dano=400;
		vida=800;
		precio=1000;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
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
