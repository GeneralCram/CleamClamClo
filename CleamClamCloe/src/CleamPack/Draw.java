package CleamPack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel { /*Warum hier extends und nicht bei JFrame?*/

private static final long serialVersionUID =1L; /*Warum verlangt der das? Was ist das?*/
protected void paintComponent(Graphics g) {

	
	
	
	/* Grafische Elemente für den Frame wie die Striche für die einzelnen Felder */
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g; 
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	g.setColor(Color.DARK_GRAY);
	
}
	}