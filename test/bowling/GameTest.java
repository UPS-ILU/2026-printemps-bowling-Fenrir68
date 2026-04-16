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
	
	void makeRolls(int[] nbQuillesList) {
		for(int nbQ : nbQuillesList) game.roll(nbQ);
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
	
	@Test
	void strikeTest() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		makeRolls(16, 0);
		assertEquals(24, game.score());
	}
	
	@Test
	void generalGame() {
		int[] nbQuillesList = {1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 7}; 
		makeRolls(nbQuillesList);
		assertEquals(122, game.score());
	}
	
	@Test
	void anotherGeneralGame() {	
		int[] nbQuillesList = {1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 8, 8}; 
		makeRolls(nbQuillesList);
		assertEquals(131, game.score());
	}
}




















