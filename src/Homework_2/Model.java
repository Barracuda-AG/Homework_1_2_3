package Homework_2;

import java.util.ArrayList;

public class Model {
    private int randomNumber;
    private ArrayList<Integer> userNumbers = new ArrayList<>();

    public void setUserNumbers(int number) {
        userNumbers.add(number);
    }

    public ArrayList<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
