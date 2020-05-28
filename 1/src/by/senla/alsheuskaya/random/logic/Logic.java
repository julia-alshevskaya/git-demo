package by.senla.alsheuskaya.random.logic;

import java.util.Arrays;
import java.util.Random;

public class Logic {
    public int generateRandom() {
        int min = 100;
        int max = 999;
        int interval = max - min;
        Random random = new Random();
        int randomNumber = random.nextInt(interval + 1)+ min;
        return randomNumber ;
    }

    public int findLargestNumber(int randomNumber) {
        String numberToString = Integer.toString(randomNumber);
        String[] numbers = numberToString.split("");
        Arrays.sort(numbers);
        int largestNumber = Integer.parseInt(numbers[numbers.length - 1]);
        return largestNumber;
    }
}
