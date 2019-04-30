package Controls;

import java.awt.event.*;

import javax.swing.JButton;

import Data.Data;
import view.GUI;

public class Control implements ActionListener {

	GUI gui;
	Data data;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("it hit");
		System.out.println(""+e.getActionCommand());

		if (e.getActionCommand().equals("start")) {
			System.out.println("wechsle sicht");
			gui.changeView(gui.getGroundView());
			data.hasStarted=true;
		}
		if (e.getActionCommand().equals("exit")) {
			System.out.println("wechsle sicht von ground zu main");
			gui.changeView(gui.getMainmenu());
		}
		

	}

	public void setGUIDATA(GUI g, Data d) {
		gui = g;
		data = d;
	}

	public void setActionListener(JButton button) {

		button.addActionListener(this);

	}

}
