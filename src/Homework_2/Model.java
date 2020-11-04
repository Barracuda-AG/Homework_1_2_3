package Homework_2;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private int minValue;
    private int maxValue;
    private int randomNumber;
    private ArrayList<Integer> userNumbers = new ArrayList<>();

    public int rand(int min, int max) {
        this.minValue = min;
        this.maxValue = max;
        return min + new Random().nextInt(max - min + 1);
    }

    public boolean checkUserNumber(int userNumber) {

        if (userNumber < getRandomNumber()) {
            this.minValue = userNumber;
            return false;
        } else if (userNumber > getRandomNumber()) {
            this.maxValue = userNumber;
            return false;
        }
        return true;
    }

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

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
