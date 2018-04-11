package CleamPack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {

private static final long serialVersionUID =1L; 
protected void paintComponent(Graphics g) {

	
	
	/* Grafische Elemente für den Frame wie die Striche für die einzelnen Felder */
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g; 
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	g.setColor(Color.DARK_GRAY);
	
	//Der vertikale Strich
	
	g.drawLine(325, 25, 325, 525);
	g.drawLine(475, 25, 475, 525);
	
	
	//Der horizontale Strich
	
	g.drawLine(150, 200, 650, 200);
	g.drawLine(150, 350, 650, 350);
}
	}