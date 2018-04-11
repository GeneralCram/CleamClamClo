package CleamPack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		/* Grafische Elemente für den Frame wie die Striche für die einzelnen Felder */
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		
		
		g.setColor(new Color(51,153,102));
		g.fillRect(0, 0, 800, 600);
		
		
		g.setColor(Color.DARK_GRAY);

		// Der vertikale Strich

		g.drawLine(325, 25, 325, 525);
		g.drawLine(475, 25, 475, 525);

		// Der horizontale Strich

		g.drawLine(150, 200, 650, 200);
		g.drawLine(150, 350, 650, 350);
		
		// Zeichne Name des Spielers
		
		g.setColor(Color.BLACK);
		if(GUI.player == 0) {
			g.drawString("[CleamClown]General Dicht", 15, 25);
		}else {
			g.drawString("[CleamClown]mrpink2k", 15, 25);
		}

		// Zeichne Name des Gewinners
		
		if(GUI.gewinner == 1) {
			g.drawString("[CleamClown]General Dicht siegt!", 15, 45);
		}else if(GUI.gewinner ==2){
			g.drawString("[CleamClown]mrpink2k siegt!", 15, 45);
		}
			
		
		
		// Bei drücken eines Knopfes Feldes wird das entsprechende Symbol/Bild geladen
		// Reihe1, Erstes Feld

		if (GUI.state[0] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
		} else if (GUI.state[0] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
		}
		// zweites Feld
		if (GUI.state[1] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
		} else if (GUI.state[1] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);
		}
		// drittes Feld
		if (GUI.state[2] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
		} else if (GUI.state[2] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);
		}
		// Zweite Reihe, viertes Feld
		if (GUI.state[3] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
		} else if (GUI.state[3] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
		}
		// fünftes Feld
		if (GUI.state[4] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
		} else if (GUI.state[4] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);
		}
		// sechstes Feld
		if (GUI.state[5] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
		} else if (GUI.state[5] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);
		}
		// Dritte Reihe, siebtes Feld
		if (GUI.state[6] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
		} else if (GUI.state[6] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
		}
		// achtes Feld
		if (GUI.state[7] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
		} else if (GUI.state[7] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);
		}
		// neuntes Feld
		if (GUI.state[8] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
		} else if (GUI.state[8] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);
		}
		repaint();
	}
}