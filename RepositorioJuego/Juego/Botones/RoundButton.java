package Botones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import javax.swing.*;

import Aliados.Bart;
import Clases.Aliado;
import Clases.GameObject;
import Clases.Tienda;


public abstract class RoundButton extends JButton {
	protected Tienda tienda;
	
	public RoundButton(Tienda tien) {
		tienda= tien;
		//These statements enlarge the button so that it 
		//becomes a circle rather than an oval.
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width+54, size.height+54);
		setPreferredSize(size);
		//This call causes the JButton not to paint 
		//the background.
		//This allows us to paint a round background.
		setContentAreaFilled(false);
		setLayout(new FlowLayout());
		this.addActionListener(new oyenteBoton());
	}
	//Paint the round background and label.
	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			//You might want to make the highlight color 
			//a property of the RoundButton class.
			g.setColor(Color.lightGray);
		} else {
			g.setColor(getBackground());
		}
		g.fillOval(0, 0, getSize().width, 
				getSize().height);
		//This call will paint the label and the 
		//focus rectangle.
		super.paintComponent(g);
	}
	//Paint the border of the button using a simple stroke.
	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawOval(0, 0, getSize().width,
				getSize().height);
	}
	//Hit detection.
	Shape shape;
	public boolean contains(int x, int y) {
		//If the button has changed size, 
		//make a new shape object.
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return shape.contains(x, y);
	}

	private class oyenteBoton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Aliado entidad= crear();
			tienda.aAgregar(entidad);	
		}
	}
	
	public abstract Aliado crear();
}

