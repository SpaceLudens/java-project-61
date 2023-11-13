package hexlet.code;

import java.util.Scanner;

public interface Engine {
    void game();

    static void superGame(Engine engine) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        engine.game();
        System.out.println("конец игры");
    }
}






