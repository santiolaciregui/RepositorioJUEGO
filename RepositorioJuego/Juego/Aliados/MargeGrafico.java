package Aliados;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class MargeGrafico extends GameObjectGrafico{

	public MargeGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MargeParado.png")));
	}
	

}