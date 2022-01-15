package cha.TIEWPNS;

public class ProtonBomb extends TieWeapon {
	private String model;
	private int Yield;
	private boolean Dropped;
	
	public ProtonBomb(String model) {
		super(model);
		
		this.model = model;
		this.Yield = 7;
		this.Dropped = false;
	}
	
	public boolean getDropped() {
		return(Dropped);
	}
	
	public void setDropped(boolean Dropped) {
		this.Dropped = Dropped;
	}
	
	
	@Override
	public void Fire() {
		this.Dropped = true;
	}
}
