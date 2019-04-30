package townwars;

public class Towneconomy {
	
	Town belongsToTown ;
	int ressource;
	
	Towneconomy(Town inputtown){
		belongsToTown = inputtown;
		ressource=0;
		
	}
	
	
	public void update(){
		createSoldiers();
		ressource= ressource+1;
		//System.out.println("ressourcenstand ist: "+ressource);
		
		if(ressource>1) {
		 
		}
	}

	
	public void createSoldiers() {
			
		ressource-=10;
		belongsToTown.createSoldiers();
		
	}
}
