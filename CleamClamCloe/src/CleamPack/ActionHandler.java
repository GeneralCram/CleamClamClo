package CleamPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (GUI.gewinner == 0) {

			// erste Reihe, erster Knopf

			if (e.getSource() == GUI.knopf[0]) {

				// Wenn ein gedrücktes Feld noch auf 0 (Leer) steht und Spieler X dran ist dann:
				if (GUI.state[0] == 0 && GUI.player == 0) {
					// Knopf 1(0) ist nun gedrückt von Spieler X
					GUI.state[0] = 1;
					// Nächster Spieler ist dran
					GUI.player = 1;

				} else if (GUI.state[0] == 0 && GUI.player == 1) {
					GUI.state[0] = 2;
					GUI.player = 0;
				}

				// zweiter Knopf
			} else if (e.getSource() == GUI.knopf[1]) {
				if (GUI.state[1] == 0 && GUI.player == 0) {
					GUI.state[1] = 1;
					GUI.player = 1;

				} else if (GUI.state[1] == 0 && GUI.player == 1) {
					GUI.state[1] = 2;
					GUI.player = 0;
				}
			} // dritter Knopf
			else if (e.getSource() == GUI.knopf[2]) {
				if (GUI.state[2] == 0 && GUI.player == 0) {
					GUI.state[2] = 1;
					GUI.player = 1;

				} else if (GUI.state[2] == 0 && GUI.player == 1) {
					GUI.state[2] = 2;
					GUI.player = 0;
				}
			} // Zweite Reihe, vierter Knopf
			else if (e.getSource() == GUI.knopf[3]) {
				if (GUI.state[3] == 0 && GUI.player == 0) {
					GUI.state[3] = 1;
					GUI.player = 1;

				} else if (GUI.state[3] == 0 && GUI.player == 1) {
					GUI.state[3] = 2;
					GUI.player = 0;
				}
			} // fünfter Knopf
			else if (e.getSource() == GUI.knopf[4]) {
				if (GUI.state[4] == 0 && GUI.player == 0) {
					GUI.state[4] = 1;
					GUI.player = 1;

				} else if (GUI.state[4] == 0 && GUI.player == 1) {
					GUI.state[4] = 2;
					GUI.player = 0;
				}
			} // sechster Knopf
			else if (e.getSource() == GUI.knopf[5]) {
				if (GUI.state[5] == 0 && GUI.player == 0) {
					GUI.state[5] = 1;
					GUI.player = 1;

				} else if (GUI.state[5] == 0 && GUI.player == 1) {
					GUI.state[5] = 2;
					GUI.player = 0;
				}
			} // Dritte Reihe, siebter Knopf
			else if (e.getSource() == GUI.knopf[6]) {
				if (GUI.state[6] == 0 && GUI.player == 0) {
					GUI.state[6] = 1;
					GUI.player = 1;

				} else if (GUI.state[6] == 0 && GUI.player == 1) {
					GUI.state[6] = 2;
					GUI.player = 0;
				} // Achter Knopf
			} else if (e.getSource() == GUI.knopf[7]) {
				if (GUI.state[7] == 0 && GUI.player == 0) {
					GUI.state[7] = 1;
					GUI.player = 1;

				} else if (GUI.state[7] == 0 && GUI.player == 1) {
					GUI.state[7] = 2;
					GUI.player = 0;

				} // neunter Knopf
			} else if (e.getSource() == GUI.knopf[8]) {
				if (GUI.state[8] == 0 && GUI.player == 0) {
					GUI.state[8] = 1;
					GUI.player = 1;

				} else if (GUI.state[8] == 0 && GUI.player == 1) {
					GUI.state[8] = 2;
					GUI.player = 0;
				}

			}
		}
	}
}
