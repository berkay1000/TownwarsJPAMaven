package townwars;

import java.awt.Color;

public class Faction {

	static int factioncounter = 0;
	int FactionID = 0;
	Color col;
	int fac;

	public Color getCol() {
		return col;
	}

	public void setCol(Color col) {
		this.col = col;
	}

	String factionname;
	int amountTown = 0;

	public int getAmountTown() {
		return amountTown;
	}

	public Faction(Color inputcol, String inputfactionname) {

		col = inputcol;
		factionname = inputfactionname;
		FactionID = factioncounter;
		factioncounter++;

	}

	public void countTowns() {
		amountTown++;
	}

	public void resetTownCount() {
		amountTown = 0;
	}

}
