package cha.TIESPT;

public class TiePilot {
	private String IDNumber;
	private String rank;
	private String pilotRating;

	public TiePilot(String IDNumber, String rank, String pilotRating) {
		this.IDNumber = IDNumber;
		this.rank = rank;
		this.pilotRating = pilotRating;
	}
	
	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}
	
	public String getIDNumber() {
		return(IDNumber);
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return(rank);
	}
	
	public void setPilotRating(String pilotRating) {
		this.pilotRating = pilotRating;
	}
	
	public String getPilotRating() {
		return(pilotRating);
	}
	
	public void displaysInfo() {
		System.out.println("ID: " + IDNumber);
		System.out.println("RANK: " + rank);
		System.out.println("RATING:" + pilotRating);
	}
}
