package bowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	Game game;
	
	@BeforeEach
	void setUp() {
		game = new Game();
	}

	void makeRolls(int nbRoll, int nbQuilles) {
		for(int i=0; i<nbRoll; i++) game.roll(nbQuilles);
	}
	
	@Test
	void noRoll() {
		assertEquals(0, game.score());
	}
	
	@Test
	void manyRoll_0() {
		makeRolls(20, 0);
		assertEquals(0, game.score());
	}
	
	@Test
	void manyRoll_1() {
		makeRolls(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	void manyRoll_1_and_2() {
		makeRolls(10, 1);
		makeRolls(10, 2);
		assertEquals(30, game.score());
	}
	
	@Test
	void spareTest() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		makeRolls(17, 0);
		assertEquals(18, game.score());
	}
}
