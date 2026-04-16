package bowling;

public class Game {
	
	private int curScore = 0;
	private int scoreInRound = 0;
	private int nbRound = 0;
	private boolean firstInRound = false;
	private int[] compteDouble = {1, 1};
	
	void roll(int a) {
		if(scoreInRound==10) {
			compteDouble[0]+=1;
			if(firstInRound) {
				compteDouble[1] += 1;
				firstInRound = false;
			}
		}
		
		if(firstInRound = !firstInRound) {
			nbRound++;
			scoreInRound=0;
		}
		
		scoreInRound+=a;
		curScore+=(nbRound>10?1:compteDouble[0])*a;
		
		compteDouble[0] = compteDouble[1];
		compteDouble[1] = 1;
	}
	
	int score() {
		return curScore;
	}
}
