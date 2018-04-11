/* Hier wird die grafische Oberfläche vom Cleam Spiel erstellt*/

package CleamPack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	JFrame jf;
	Draw draw;
	JButton ResetKnopf;
	
	/* Ein Array aus 9 Knöpfen, die jeweils ein Feld darstellen*/
	static JButton knopf[] = new JButton[9];
	
	//state = 0 ist leer, state = 1 ist X, state = 2 ist 0 (Das Arrays immer noch mit 0 Anfangen müssen... wird nicht ohne Grund kritisiert!)
	
	static int state[] = new int[9];
	
	// player=0 ist X, player = 1 ist O;
	static int player = 0;
	static int gewinner = 0;
	
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
		knopf[i] = new JButton("");
		knopf[i].setVisible(true);
		knopf[i].addActionListener(new ActionHandler());
		knopf[i].setFocusPainted(false);
		knopf[i].setContentAreaFilled(false);
		knopf[i].setBorder(null);
		//Knopf wird dem JFrame zugeordnet//
		jf.add(knopf[i]);
		
	}

	//Da es static ist kann man von überall drauf zugreifen
	ButtonPlacement.place();
	
	ResetKnopf = new JButton("Reset");
	ResetKnopf.setBounds(675, 500, 100, 40);
	ResetKnopf.setBackground(new Color(51,102,153));
	ResetKnopf.setForeground(Color.WHITE);
	ResetKnopf.setFocusPainted(false);
	ResetKnopf.setVisible(true);
	ResetKnopf.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Funktion.reset();
			
		}
	});
	jf.add(ResetKnopf);
	
	
	//Das gezeichnete Gitternetz aus der Drawklasse wird dem Spielfeld hinzugefügt
	draw = new Draw();
	draw.setBounds(0,0,800,600);
	draw.setVisible(true);
	jf.add(draw);
	
	
	jf.setVisible(true);
	}
}