package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    private static final String GAME_RULE = "What is the result of the expression?";
    public static char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = getRandomNumber(0, operators.length);
        return operators[randomIndex];
    }
    public static int calculateExpression(int num1, int num2, char operator) {
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result =  num1 - num2;
        } else if (operator == '*') {
            result =  num1 * num2;
        }
        return result;
    }
    public static void game() {
        final int arraysCount = 3;
        final int arraysLength = 2;
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[arraysCount][arraysLength];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int firstRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            int secondRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            char randomOperator = generateRandomOperator();
            int expressionResult = calculateExpression(firstRandomNumber, secondRandomNumber, randomOperator);
            for (int j = 0; j < questionsAndCorrectAnswers.length - 2; j++) {
                questionsAndCorrectAnswers[i][j] = firstRandomNumber + " " + randomOperator + " " + secondRandomNumber;
                questionsAndCorrectAnswers[i][j + 1] = String.valueOf(expressionResult);
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
