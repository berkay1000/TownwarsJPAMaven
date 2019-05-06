package townwars;

import javax.swing.JFrame;

import Controls.Control;
import Data.Data;
import view.GUI;

public class Main {

	public static void main(String[] args) {

		// erstelle Objekte die f�r MVC-Pattern ben�tigt werden
		Control ctrl = new Control();
		Data data = new Data();
		GUI gui = new GUI();

		// verbinde mvc
		ctrl.setGUIDATA(gui, data);
		data.setCTRLGUI(ctrl, gui);
		gui.setDATACTRL(data, ctrl);

		// erstelle unterliegenden Jpanes wie Men� und groundview/schlachtfeld
		gui.createViews();
		gui.setpanetomain();// zuerst kriegt mainmen� den fokus

		gui.setContentPane(gui.getCurrentpane());
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(Integer.parseInt(data.rpf.prop.getProperty("framewidth")),
				Integer.parseInt(data.rpf.prop.getProperty("frameheight")));
		gui.setVisible(true);

		int zaehler = 0;

		while (true) { // true soll sp�ter zu pause werden

			try {
				Thread.sleep(17); // 17
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

//			System.out.print(zaehler); 
//			zaehler++;

			data.update();

			gui.getCurrentpane().repaint();
		}

	}

}
