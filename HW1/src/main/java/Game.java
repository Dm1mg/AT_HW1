
import java.util.Random;

public class Game {
    private final Door[] doors = new Door[3];
    private final Contestant contestant = new Contestant();
    private final Host host = new Host();

    public boolean play(boolean switchStrategy) {
        Random rand = new Random();
        int prizeDoor = rand.nextInt(3);
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door(i == prizeDoor);
        }

        int initialChoice = contestant.chooseDoor(3);
        int revealedDoor = host.revealDoor(doors, initialChoice);
        int finalChoice = switchStrategy ?
                contestant.switchDoor(initialChoice, revealedDoor, 3) :
                initialChoice;

        return doors[finalChoice].hasPrize();
    }
}