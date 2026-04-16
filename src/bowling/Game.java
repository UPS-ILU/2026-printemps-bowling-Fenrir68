package bowling;

public class Game {
	
	private int curScore = 0;
	
	void roll(int a) {
		curScore+=a;
	}
	
	int score() {
		return curScore;
	}
}
