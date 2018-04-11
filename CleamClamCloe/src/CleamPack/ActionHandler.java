package CleamPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(GUI.gewinner == 0)
		{
			
			
			//erste Reihe
			
			if(e.getSource() == GUI.knopf[0]) {
				
				//Wenn ein gedrücktes Feld noch auf 0 (Leer) steht und Spieler X dran ist dann:
				if(GUI.state[0] == 0 && GUI.player == 0){
					//Knopf ist nun gedrückt von Spieler X
					GUI.state[0] = 1;
					// Nächster Spieler ist dran
					GUI.player=1;
				} else if (GUI.state[0] == 0 && GUI.player == 1) {
				}
			}
		}
	}

}
