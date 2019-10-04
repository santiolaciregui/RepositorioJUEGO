package Aliados;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class LisaGrafico extends GameObjectGrafico{

	public LisaGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParado.png")));
	}
	

}