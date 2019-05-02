package Controls;

import java.awt.event.*;

import javax.swing.JButton;

import Data.Data;
import view.GUI;

public class Control implements ActionListener, MouseListener {

	GUI gui;
	Data data;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("it hit");
		System.out.println("" + e.getActionCommand());

		if (e.getActionCommand().equals("start")) {
			System.out.println("wechsle sicht von main zu ground");
			gui.changeView(gui.getGroundView());
			data.hasStarted = true;
		} else if (e.getActionCommand().equals("exit")) {
			System.out.println("wechsle sicht von ground zu main");
			data.hasStarted = false;
			gui.changeView(gui.getMainmenu());
			data.clearMap();
		}

		else if (e.getActionCommand().equals("pause")) {
			
			if(data.hasStarted == false) data.hasStarted = true;
			
			else if(data.hasStarted == true) data.hasStarted = false;
		
		}
		else if(e.getActionCommand().equals("attack")) {
			System.out.println("angriff!");
		}
		

		else {
			String Townindex = e.getActionCommand();
			int townindexnumber = Integer.parseInt(Townindex);
			System.out.println("setze "+townindexnumber+"auf activeTown");
			data.setactiveTownIndex(townindexnumber);
		}

	}

	public void setGUIDATA(GUI g, Data d) {
		gui = g;
		data = d;
	}

	public void setActionListener(JButton button) {

		button.addActionListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
