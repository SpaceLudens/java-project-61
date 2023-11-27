package hexlet.code;
public class GameRules {
    public static String gamesRules(int gameNumber) {
        String[] gamesRules = {"Answer 'yes' if the number is even, otherwise answer 'no'.",
                "What is the result of the expression?",
                "Find the greatest common divisor of given numbers.",
                "What number is missing in the progression?",
                "Answer 'yes' if given number is prime. Otherwise answer 'no'." };
        return gamesRules[gameNumber];
    }
}
