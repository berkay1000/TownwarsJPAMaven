package townwars;

public class Governor {

	int baseattacksize = 20;
	public int defensivness; //

	public Governor() {
		defensivness = (int) (Math.random() * 11)+5; // wert von 5-15 f�r wie defensiv sich die Ki Verh�lt
		// hohe Werte lassen viel mehr Truppen zuhause

	}

	public int getBaseattacksize() {
		return baseattacksize;
	}

	public void setBaseattacksize(int baseattacksize) {
		this.baseattacksize = baseattacksize;
	}

}
