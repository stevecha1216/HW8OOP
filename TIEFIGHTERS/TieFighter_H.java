package cha.TIEFIGHTERS;

import cha.TIESPT.Location;
import cha.TIESPT.TiePilot;
import cha.TIEWPNS.LaserCannon;
import cha.TIEWPNS.ProtonBomb;
import cha.TIEWPNS.TieWeapon;
import cha.TIEOPS.Bombing;

public class TieFighter_H extends TieFighter implements Bombing{
	private String manufacturer;
	private TieWeapon[] wpns;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;


	
	public TieFighter_H(String IDNumber, TiePilot pilot) {
		super(IDNumber, pilot);
		
		this.manufacturer = "Sienar Fleet Systems";
		setModel("Tie Heavy Fighter");
		this.fighterClass = "Close Support";
		this.length = 7.8;
		this.width = 8.6;
		this.height = 5.0;
		this.fuelCapacity = 375;
		this.maxSpeed = 850;

		this.wpns = new TieWeapon[10];
		LaserCannon laser1 = new LaserCannon("L2");
		wpns[0] = laser1;
		LaserCannon laser2 = new LaserCannon("L2");
		wpns[1] = laser2;
		ProtonBomb pb1 = new ProtonBomb("P1");
		wpns[2] = pb1;
		ProtonBomb pb2 = new ProtonBomb("P1");
		wpns[3] = pb2;
		ProtonBomb pb3 = new ProtonBomb("P1");
		wpns[4] = pb3;
		ProtonBomb pb4 = new ProtonBomb("P1");
		wpns[5] = pb4;
		ProtonBomb pb5 = new ProtonBomb("P1");
		wpns[6] = pb5;
		ProtonBomb pb6 = new ProtonBomb("P1");
		wpns[7] = pb6;
		ProtonBomb pb7 = new ProtonBomb("P1");
		wpns[8] = pb7;
		ProtonBomb pb8 = new ProtonBomb("P1");
		wpns[9] = pb8;
	}
	

	public boolean bombTarget() {
		int bombsDropped = 0;
		ProtonBomb pb[] = new ProtonBomb[8];
		for(int i = 2; i < 10; i++) {
			for(int j = 0; j < pb.length; j++) {
				pb[j] = (ProtonBomb) wpns[i];
			}
		}
		for(ProtonBomb k: pb) {
			boolean Dropped = k.getDropped();
			if(Dropped == false) {
				k.Fire();
				System.out.println("Bombs Away");
				bombsDropped += 1;
			}
		}
		if(bombsDropped > 0) {
			return(true);
		}
		else{
			System.out.println("Bombs Expended");
			return(false);
		}
	}
		
	
	@Override
	public void FiresCannon() {
		wpns[0].Fire();
		wpns[1].Fire();
	}
}
