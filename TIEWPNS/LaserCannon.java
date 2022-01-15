package cha.TIEWPNS;

public class LaserCannon extends TieWeapon{
	private String model;
	private int maxRange;
	private int ammoCapacity;
	private int currentAmmoCount;
	
	public LaserCannon(String model) {
		super(model);
		
		this.model = model;
		this.maxRange = 1000;
		this.ammoCapacity = 500;
		this.currentAmmoCount = 500;
	}
	
	
	@Override
	public void Fire() {
		if(currentAmmoCount > 0) {
			currentAmmoCount -= 1;
			System.out.println("Firing Cannons");
		}
		else {
			System.out.println("Ammunition Expended");
		}
	}
}
