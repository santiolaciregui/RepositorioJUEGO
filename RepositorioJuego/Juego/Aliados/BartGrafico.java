package Aliados;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class BartGrafico extends GameObjectGrafico{

	public BartGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}
	

}