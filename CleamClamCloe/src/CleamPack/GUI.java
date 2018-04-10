/* Hier wird die grafische Oberfläche vom Cleam Spiel erstellt*/

package CleamPack;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	JFrame jf;
	Draw draw;
	
	/* Ein Array aus 9 Knöpfen, die jeweils ein Feld darstellen*/
	static JButton knopf[] = new JButton[9];
	
	public GUI() {
	
	//Der Frame wird erstellt und Parameter zugeordnet
	jf = new JFrame();
	jf.setSize(800, 600);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLocationRelativeTo(null);
	jf.setResizable(false);
	jf.setTitle("DAS CLEAM SPIEL");
	
	
	//die Knöpfe werden erstellt und Parameter zugeordnet
	for (int i=0; i<knopf.length; i ++) {
		knopf[i] = new JButton();
		knopf[i].setVisible(true);
		knopf[i].addActionListener(new ActionHandler());
		knopf[i].setFocusPainted(false);
		knopf[i].setContentAreaFilled(false);
		knopf[i].setBorder(null);
		//Knopf wird dem JFrame zugeordnet//
		jf.add(knopf[i]);
		
		
	}
		
	
	
	
	draw = new Draw();
	draw.setBounds(0,0,800,600);
	draw.setVisible(true);
	jf.add(draw);
	
	
	jf.setVisible(true);
	}
}