package Aliados;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class AbueloGrafico extends GameObjectGrafico{

	public AbueloGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,127 , 116);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}
}