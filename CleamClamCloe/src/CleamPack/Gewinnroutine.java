package CleamPack;

import java.util.Timer;
import java.util.TimerTask;

public class Gewinnroutine {

	Timer time;

	public Gewinnroutine() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				if (GUI.gewinner == 0) {

					// Reihe 1 für X Horizontal
					if (GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1) {
						GUI.gewinner = 1;
					}
					// Reihe 2 für X Horizontal
					if (GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 1) {
						GUI.gewinner = 1;
					}
					// Reihe 3 für X Horizontal
					if (GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					}
					
					// Reihe 1 für X Vertikal
					if (GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 1) {
						GUI.gewinner = 1;
					}
					// Reihe 2 für X Vertikal
					if (GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 1) {
						GUI.gewinner = 1;
					}
					// Reihe 3 für X Vertikal
					if (GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					}
					// Diagonal links oben nach rechts unten für X
					if (GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					}
					// Diagonal rechts oben nach links unten für X
					if (GUI.state[2] == 1 && GUI.state[4] == 1 && GUI.state[6] == 1) {
						GUI.gewinner = 1;
					}
				}
			
				
				if (GUI.gewinner == 0) {
					
					// Reihe 1 für O Horizontal
					if (GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2) {
						GUI.gewinner = 2;
					}
					// Reihe 2 für O Horizontal
					if (GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 2) {
						GUI.gewinner = 2;
					}
					// Reihe 3 für O Horizontal
					if (GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					}
					// Reihe 1 für O Vertikal
					if (GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 2) {
						GUI.gewinner = 2;
					}
					// Reihe 2 für O Vertikal
					if (GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 2) {
						GUI.gewinner = 2;
					}
					// Reihe 3 für O Vertikal
					if (GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					}
					// Diagonal links oben nach rechts unten für O
					if (GUI.state[0] == 2 && GUI.state[4] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					}
					// Diagonal rechts oben nach links unten für O
					if (GUI.state[2] == 2 && GUI.state[4] == 2 && GUI.state[6] == 2) {
						GUI.gewinner = 2;
					}
				}
			}
		}, 0, 150);
	}

}
