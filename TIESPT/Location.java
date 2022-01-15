package cha.TIESPT;

public class Location {
	private int X;
	private int Y;
	private int Z;

	public Location(int X, int Y, int Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	
	public int getX() {
		return (X);
	}
	
	public void setX(int X) {
		this.X = X;
	}
	
	public int getY() {
		return (Y);
	}
	
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getZ() {
		return (Z);
	}
	
	public void setZ(int Z) {
		this.Z = Z;
	}
	
	public String toString() {
		String sX = Integer.toString(X);
		String sY = Integer.toString(Y);
		String sZ = Integer.toString(Z);
		String location = "Location [X:" + sX + ", Y:" + sY + ", Z:" + sZ + "]";
		return(location);
	}
}
