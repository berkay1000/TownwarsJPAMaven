package townwars;

import java.util.ArrayList;

import javax.swing.JFrame;

import Controls.Control;
import Data.Data;
import Data.ReadPropertyFile;
import view.GUI;

public class Main {

	public static void main(String[] args) {
		

		Control ctrl = new Control();
		Data data = new Data();
		GUI gui = new GUI();

		ctrl.setGUIDATA(gui, data);
		data.setCTRLGUI(ctrl, gui);
		gui.setDATACTRL(data, ctrl);

		gui.createViews();
		gui.setpanetomain();

		gui.setContentPane(gui.getCurrentpane());
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(Integer.parseInt(data.rpf.prop.getProperty("framewidth")), Integer.parseInt(data.rpf.prop.getProperty("frameheight")));
		gui.setVisible(true);

		int zaehler = 0;
		
		
		while (true) {
			

			try {
				Thread.sleep(17); // 17
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.print(zaehler); 
			zaehler++;
			
			data.update();
			
			
			
			gui.getCurrentpane().repaint();
		}

	}

}
