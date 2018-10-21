package tennis;

/*
 * Set en n jeux
 */

public class Set {
	
	private int scoreA;
	private int scoreB;
	private int n;
	
	public void addPoint(int player) {
		if (player == 1) {
			scoreA ++;
		} else {
			scoreB ++;
		}
	}
	
	// n jeux avec 2 points d'écart ou n+1 jeux  
	public boolean checkEnd() {
		return (((scoreA == n || scoreB == n) && Math.abs(scoreA - scoreB) >= 2) || scoreA == (n+1) || scoreB == (n+1));
	}
	
	public int checkWinner() {
		return scoreA > scoreB ? 1 : 2;
	}
	
	public String toString() {
		return String.valueOf(scoreA)  + " - " + String.valueOf(scoreB);
	}
	
	public int getScoreA() {
		return scoreA;
	}
	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}
	public int getScoreB() {
		return scoreB;
	}
	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}
