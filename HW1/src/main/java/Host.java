public class Host extends Person {
    @Override
    public int chooseDoor(int numberOfDoors) {
        throw new UnsupportedOperationException("Хост не сделал выбора");
    }

    public int revealDoor(Door[] doors, int contestantChoice) {
        for (int i = 0; i < doors.length; i++) {
            if (i != contestantChoice && !doors[i].hasPrize()) {
                return i;
            }
        }
        throw new IllegalStateException("Нет дверей для открытия");
    }
}