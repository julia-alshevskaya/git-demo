package by.senla.alsheuskaya.random.demo;

import by.senla.alsheuskaya.random.logic.Logic;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        int randomNumber = logic.generateRandom();
        System.out.println(randomNumber);
        System.out.println(logic.findLargestNumber(randomNumber));
    }
}
