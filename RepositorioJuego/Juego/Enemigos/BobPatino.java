package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class BobPatino extends Enemigo {

	public BobPatino(int x, int y) {
		super(x, y);
		dano=300;
		vida=1400;
		monedas=700;
		puntosDeMuerte=1000;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoParado.png")));
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}
}
