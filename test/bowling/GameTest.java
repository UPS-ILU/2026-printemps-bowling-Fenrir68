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
}
