package townwars;

import java.awt.Point;

public class Soldat {
	
	static int soldatennummer;
	private Point position;
	private int stance=1;//1 Patrolling,2 attacking
	private int healthpoints;
	@SuppressWarnings("unused")
	private Town currenttown;
	
	
	public Soldat(Point stadtpos) {
		position = stadtpos;
	}
	
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getStance() {
		return stance;
	}
	public void setStance(int stance) {
		this.stance = stance;
	}
	public int getHealthpoints() {
		return healthpoints;
	}
	public void setHealthpoints(int healthpoints) {
		this.healthpoints = healthpoints;
	}
	
	
	public void update() {
		
		if(stance==1) {
			patrolling();
		}
		if(stance==2) {
			attacking();
			
		}
		
		
		
	}
	private void attacking() {
		
		
	}
	private void patrolling() {
		System.out.println("patrolliere");
		
	}
	

}
