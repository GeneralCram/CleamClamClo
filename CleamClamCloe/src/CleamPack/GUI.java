/* Hier wird die grafische Oberfläche vom Spiel erstellt*/

package CleamPack;

import javax.swing.JFrame;

public class GUI {

	JFrame jf;
	Draw draw;
	
	public GUI() {
	
	jf = new JFrame();
	jf.setSize(800, 600);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
	jf.setTitle("DAS CLEAM SPIEL");
	
	draw = new Draw();
	draw.setBounds(0,0,800,600);
	draw.setVisible(true);
	jf.add(draw);
	jf.setVisible(true);
	}
}