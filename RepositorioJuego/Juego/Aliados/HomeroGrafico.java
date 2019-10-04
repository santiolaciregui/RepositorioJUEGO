package Aliados;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class HomeroGrafico extends GameObjectGrafico{

	public HomeroGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}
	

}
