package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Controls.Control;
import Data.Data;

public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Data data;
	Control ctrl;
	JPanel currentpane;

	JPanelMainMenu mainmenu;
	JPanelGroundView groundView;
	JPanelOptionMenu optionmenupane;

	public JPanelGroundView getGroundView() {
		return groundView;
	}

	public void setGroundView(JPanelGroundView groundView) {
		this.groundView = groundView;
	}

	public JPanelMainMenu getMainmenu() {
		return mainmenu;
	}

	public void setMainmenu(JPanelMainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}

	public void setDATACTRL(Data d, Control c) {
		data = d;
		ctrl = c;

	}

	public Control getCtrl() {
		return ctrl;
	}

	public void setCtrl(Control ctrl) {
		this.ctrl = ctrl;
	}

	public void setpanetomain() { // setzt mainmenu auf

		currentpane = mainmenu;

	}

	public void changeView(JPanel changetoPanel) { // setzt mainmenu auf
		System.out.println("setGroundviewtoCurrent");
		currentpane = changetoPanel;
		this.setVisible(false);
		this.setContentPane(changetoPanel);
		this.setVisible(true);

	}
	public void creategroundView() {
		
		
	}

	public void createViews() {
		mainmenu = new JPanelMainMenu(this);
		groundView = new JPanelGroundView(this);
		optionmenupane= new JPanelOptionMenu(this);
		
	}

	public JPanel getCurrentpane() {
		return currentpane;
	}

	public JPanelOptionMenu getOptionMenu() {
		// TODO Auto-generated method stub
		return optionmenupane;
	}

}
