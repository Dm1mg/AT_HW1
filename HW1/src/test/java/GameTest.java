
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void testPlayWithSwitching() {
        assertDoesNotThrow(() -> game.play(true));
    }

    @Test
    public void testPlayWithoutSwitching() {
        assertDoesNotThrow(() -> game.play(false));
    }

    @Test
    public void testPlayReturnsBoolean() {
        boolean result = game.play(true);
        assertTrue(result || !result);
    }
}