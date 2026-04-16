package bowling;

public class Game {
	
	private int curScore = 0;
	private int scoreInRound = 0;
	private boolean firstInRound = false;
	private boolean isPrevSpare = false;
	
	void roll(int a) {
		isPrevSpare = scoreInRound==10;
		
		if(firstInRound = !firstInRound)
			scoreInRound=0;
		
		scoreInRound+=a;
		curScore+=(isPrevSpare ? 2*a : a);
	}
	
	int score() {
		return curScore;
	}
}
