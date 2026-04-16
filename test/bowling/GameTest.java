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

	
	@Test
	void noRoll() {
		assertEquals(0, game.score());
	}
	
	@Test
	void manyRoll_0() {
		for(int i=0; i<20; i++) game.roll(0);
		assertEquals(0, game.score());
	}
	
	@Test
	void manyRoll_1() {
		for(int i=0; i<20; i++) game.roll(1);
		assertEquals(20, game.score());
	}
}
