package cha.TIEFIGHTERS;

import cha.TIESPT.Location;
import cha.TIESPT.TiePilot;
import cha.TIEWPNS.LaserCannon;
import cha.TIEWPNS.TieWeapon;

public class TieFighter_S extends TieFighter {
	private String manufacturer;

	private TieWeapon[] wpns;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;


	
	public TieFighter_S(String IDNumber, TiePilot pilot) {
		super(IDNumber, pilot);
		
		this.manufacturer = "Sienar Fleet Systems";
		setModel("Tie Standard");
		this.fighterClass = "Superiority";
		this.length = 6.3;
		this.width = 6.4;
		this.height = 7.5;
		this.fuelCapacity = 200;
		this.maxSpeed = 1200;

		this.wpns = new TieWeapon[2];
		LaserCannon laser1 = new LaserCannon("L1");
		wpns[0] = laser1;
		LaserCannon laser2 = new LaserCannon("L1");
		wpns[1] = laser2;
	}

	
	@Override
	public void FiresCannon() {
		wpns[0].Fire();
		wpns[1].Fire();
	}
}
