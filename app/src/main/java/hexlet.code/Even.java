package hexlet.code;

import java.util.Scanner;

class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        Cli.acquaintance();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            int randomNumber = (int) (Math.random() * 10);
            boolean parity = randomNumber % 2 == 0;

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals("yes") && parity) {
                System.out.println("Correct!");
                count++;
            } else if (answer.equals("no") && !parity) {
                System.out.println("Correct");
                count++;
            } else if (answer.equals("yes") && !parity) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            } else if (answer.equals("no") && parity) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
            if (count == 3) {
                System.out.println("Congratulations, " + Cli.name + "!");
            }
        }
    }
}
