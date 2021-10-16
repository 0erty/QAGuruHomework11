package utils;

import java.util.Random;

public class RandomUtils {

    public static String getRandomSubject() {
        String[] subjects = {"English", "Maths", "Chemistry", "Computer Science",
                             "Commerce", "Economics", "Accounting", "Arts",
                             "Social studies", "Physics", "History", "Civics"};

        int rnd = new Random().nextInt(subjects.length);

        return subjects[rnd];
    }

    public static String getRandomPhone() {

        int random_int = (int)Math.floor(Math.random()*(9999999999999L - 1000000000000L + 1) + 1000000000000L);

        return String.valueOf(random_int);
    }
}
