package hexlet.code;

import java.util.Random;

public class RandomNumbers {
    public static int getRandomNumber(int from, int to) {
        Random random = new Random();
        return random.nextInt(from,to);
    }
}
