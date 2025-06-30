import java.util.Random;

public class Contestant extends Person {
    private final Random random = new Random();

    @Override
    public int chooseDoor(int numberOfDoors) {
        return random.nextInt(numberOfDoors);
    }

    public int switchDoor(int initialChoice, int revealedDoor, int numberOfDoors) {
        for (int i = 0; i < numberOfDoors; i++) {
            if (i != initialChoice && i != revealedDoor) {
                return i;
            }
        }
        return initialChoice;
    }
}