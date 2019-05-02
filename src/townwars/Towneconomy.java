package townwars;

public class Towneconomy {

	Town belongsToTown;
	int ressource;
	int ressourceIncrease;
	int zaehler;

	Towneconomy(Town inputtown) {
		belongsToTown = inputtown;
		ressource = 0;
		zaehler = 0;

	}

	public void update() {
		while (ressource > 10) {
			createSoldiers();
		}
		ressource = ressource + 5;
		// System.out.println("ressourcenstand ist: "+ressource);

//		zaehler++;
//
//		if (zaehler > 100) {
//			ressourceIncrease++;
//			zaehler = 0;
//		}

	}

	public void createSoldiers() {

		ressource -= 10;
		belongsToTown.createSoldiers();

	}
}
