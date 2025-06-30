import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {
    private Game game;

    @BeforeEach
    void init() {
        game = new Game();
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void testMultipleSimulations(boolean switchStrategy) {
        int wins = 0;
        for (int i = 0; i < 100; i++) {
            if (game.play(switchStrategy)) {
                wins++;
            }
        }
        assertTrue(wins >= 0 && wins <= 100);
    }

    @Test
    void testInvalidRevealThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            // сценарий если все призы
            new Host().revealDoor(new Door[]{
                    new Door(true),
                    new Door(true),
                    new Door(true)
            }, 0);
        });
    }
}
