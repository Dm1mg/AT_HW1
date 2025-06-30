public class MontyHallSimulation {
    public static void main(String[] args) {
        Game game = new Game();
        int switchWins = 0;
        int stayWins = 0;
        int simulations = 1000;

        for (int i = 0; i < simulations; i++) {
            if (game.play(true)) switchWins++;
            if (game.play(false)) stayWins++;
        }

        System.out.println("После " + simulations + " симуляций:");
        System.out.println("Меняющий дверь победил: " + switchWins + " раз");
        System.out.println("Оставляющий дверь: " + stayWins + " раз");
    }
}