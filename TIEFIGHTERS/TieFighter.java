package cha.TIEFIGHTERS;


import cha.TIEOPS.Maneuvering;
import cha.TIEOPS.Scanning;
import cha.TIESPT.Location;
import cha.TIESPT.TiePilot;
import cha.TIEWPNS.TieWeapon;

public abstract class TieFighter implements Maneuvering, Scanning {
	private String manufacturer;
	private String IDNumber;
	private String model;
	private TieWeapon[] wpns;
	private TiePilot pilot;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborn;
	private Location currentLocation;
	
	public TieFighter() {
		
	}
	
	public TieFighter(String IDNumber, TiePilot pilot) {
		this.IDNumber = IDNumber;
		this.pilot = pilot;
		this.currentLocation = new Location(0,0,0);
		this.currentLocation.setX(12);
		this.currentLocation.setY(10);
		this.currentLocation.setZ(0);
	}
	
	public void MoveLeft() {
		int x = currentLocation.getX();
		x -= 1;
		currentLocation.setX(x);
	}
	
	public void MoveRight() {
		int x = currentLocation.getX();
		x += 1;
		currentLocation.setX(x);
	}
	
	public void MoveForward() {
		int y = currentLocation.getY();
		y += 1;
		currentLocation.setY(y);
	}
	
	public void MoveBackward() {
		int y = currentLocation.getY();
		y -= 1;
		currentLocation.setY(y);
	}
	
	public void Ascend() {
		int z = currentLocation.getZ();
		z += 1;
		currentLocation.setZ(z);
	}
	
	public void Descend() {
		int z = currentLocation.getZ();
		z -= 1;
		currentLocation.setZ(z);
	}
	
	public void Land() {
		int z = currentLocation.getZ();
		z = 0;
		currentLocation.setZ(z);
		this.isLanded = true;
		this.isSpaceborn = false;
	}
	
	public void Takeoff() {
		int z = currentLocation.getZ();
		z = 10;
		currentLocation.setZ(z);
		this.isLanded = false;
		this.isSpaceborn = true;
	}
	
	public void scanTarget() {
		String IDNumber = this.IDNumber;
		System.out.println(IDNumber + " is scanning for targets");
	}
	
	public TiePilot getPilot() {
		return(pilot);
	}
	
	public Location getCurrentLocation() {
		return(currentLocation);
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void displayFighterData() {
		System.out.println("Model: " + model);
		System.out.println("ID Number: " + IDNumber);
		String pilotID = pilot.getIDNumber();
		System.out.println("PILOT ID Number: " + pilotID);
		String pilotRank = pilot.getRank();
		System.out.println("PILOT Rank: " + pilotRank);
	}
	
	public abstract void FiresCannon();

}
