package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jerseyNumber;
	private String shootingHand;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer(String n, int j, String s) {
		this.name = n;
		this.jerseyNumber = j;
		this.shootingHand = s;
		goals = 0;
		assists = 0;
	}
	
	public void recordGame(int g, int a) {
		goals += g;
		assists += a;
		games++;
	}
	
	public int getPoints() {
		return assists + goals;
	}
	
	
	
	

}
