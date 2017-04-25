package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(800,800);
		sleep(2200);
		
		driveDirect(0,350);
		sleep(850);
		
		driveDirect(500,500);
		sleep(4000);
		
		driveDirect(500,0);
		sleep(888);
		
		driveDirect(00,500);
		
		
		
		
		
	}

	public void loop() {
	
	}
}

