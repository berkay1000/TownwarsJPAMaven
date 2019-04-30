package Data;

import java.awt.Color;
import java.util.ArrayList;

import Controls.Control;
import townwars.Angriffsarmee;
import townwars.Faction;
import townwars.Town;
import view.GUI;

public class Data {

	public ReadPropertyFile rpf = new ReadPropertyFile();
	Control ctrl;
	GUI gui;
	ArrayList<Town> townlist;
	ArrayList<Faction> FactionList;
	ArrayList<Angriffsarmee> angriffsarmeelist;
	public boolean hasStarted = false;

	public ArrayList<Angriffsarmee> getAngriffsarmeelist() {
		return angriffsarmeelist;
	}

	public ArrayList<Town> getTownlist() {
		return townlist;
	}

	public void setTownlist(ArrayList<Town> inputtownlist) {
		townlist = inputtownlist;
	}

	public Data() {

		angriffsarmeelist = new ArrayList<Angriffsarmee>();
		townlist = new ArrayList<Town>();
		FactionList = new ArrayList<Faction>();
		FactionList.add(new Faction(Color.GRAY, "neutral"));
		FactionList.add(new Faction(Color.YELLOW, "yellow walker"));
		FactionList.add(new Faction(Color.RED, "red walker"));
		FactionList.add(new Faction(Color.black, "black walker"));
		FactionList.add(new Faction(Color.BLUE, "Blue walker"));
		FactionList.add(new Faction(Color.magenta, "magenta walker"));
		FactionList.add(new Faction(Color.CYAN, "Cyan walker"));
		FactionList.add(new Faction(Color.DARK_GRAY, "DG walker"));
		FactionList.add(new Faction(Color.ORANGE, "Orange walker"));
		FactionList.add(new Faction(Color.green, "Cyan walker"));

		int anztown = Integer.parseInt(rpf.prop.getProperty("townamounts"));
		int facam = Integer.parseInt(rpf.prop.getProperty("FactionAmounts"));

		for (int i = 0; i < anztown; i++) {

			int randnumb = (int) (Math.random() * (facam));
			townlist.add(new Town(townlist, FactionList.get(randnumb)));

		}

		boolean keineStadtzunahe = true;
		for (int i = 0; i < anztown; i++) {
			keineStadtzunahe = townlist.get(i).getNearestTownforTheFirstTime();

			if (keineStadtzunahe == false) {
				i = -1;
				//System.out.println("keineStadtzunahe" + keineStadtzunahe);
			}
		}
		//System.out.println("stadtnähe wurde erzeugt");

		for (int i = 0; i < anztown; i++) {
			keineStadtzunahe = townlist.get(i).setnahstefeindlicheStadt();
		}

	}

	public ArrayList<Faction> getFactionList() {
		return FactionList;
	}

	public void setCTRLGUI(Control c, GUI g) {
		ctrl = c;
		gui = g;

	}

	public void updateSoldierPosition() {

	}

	public void createWorld() {

	}

	public void update() {

		if (hasStarted == false) {

		} else {
			for (int i = 0; i < FactionList.size(); i++) {
				FactionList.get(i).resetTownCount();
			}

			System.out.println("dataupdate!");
			for (int i = 0; i < townlist.size(); i++) {
				townlist.get(i).update();

				try {
					angriffsarmeelist.add(townlist.get(i).createAngriffsArmee());

				} catch (Exception e) {

				}
			}

			for (int i = 0; i < angriffsarmeelist.size(); i++) {
				angriffsarmeelist.get(i).update();
			}
			for (int i = 0; i < angriffsarmeelist.size();) {
				if (angriffsarmeelist.get(i).getSoldaten().size() == 0) {
					angriffsarmeelist.remove(i);
				} else {
					i++;
				}

			}
		}

	}

}
