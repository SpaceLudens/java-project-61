package hexlet.code;

public class Engine {
    public static String name;
    public static String gamesRules(int gameNumber) {
        String[] gamesRules = {"Answer 'yes' if the number is even, otherwise answer 'no'.",
                "What is the result of the expression?"};
        return gamesRules[gameNumber];
    }


    public static void gameLauncher(int gameRulesNumber, Game game) {
        Cli.acquaintance();
        System.out.println(gamesRules(gameRulesNumber));
            Game.game();
    }

}






