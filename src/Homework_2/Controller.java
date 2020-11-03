package Homework_2;

import java.util.Random;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private int minValue;
    private int maxValue;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        boolean flag;

        model.setRandomNumber(rand(0,100));
        Scanner scanner = new Scanner(System.in);
        do {
            model.setUserNumbers(inputValueWithScanner(scanner));
           flag = checkUserNumber(model.getUserNumbers().get(model.getUserNumbers().size() - 1));
        } while(!flag);
        view.printMessage(View.USER_TRIES);
        view.printMessage(model.getUserNumbers().toString());
    }
    public int rand(int min, int max){
        view.printMessage(View.PROGRAM_GUESS);
        minValue = min;
        maxValue = max;
        return min + new Random().nextInt(max - min + 1);
    }
    public int rand(){
        view.printMessage(View.PROGRAM_GUESS);
        minValue = 0;
        maxValue = 100;
        return new Random().nextInt(100 + 1);
    }
    public int inputValueWithScanner(Scanner scanner){
        int userNumber;
        do {
            view.printMessage(View.USER_INPUT);
            while (!scanner.hasNextInt()) {
                view.printMessage(View.NOT_A_NUMBER);
                scanner.next();
            }
            userNumber = scanner.nextInt();
        } while (userNumber < 0);

        return userNumber;
    }
    public boolean checkUserNumber(int userNumber){

        if(userNumber < model.getRandomNumber()){
            minValue = userNumber;
            view.printMessage(View.NUMBER_IS_SMALLER);
            view.printMessage("The range is from " + minValue + " to " + maxValue);
            return false;
        }
        else if(userNumber > model.getRandomNumber()){
            maxValue = userNumber;
            view.printMessage(View.NUMBER_IS_GREATER);
            view.printMessage("The range is from " + minValue + " to " + maxValue);
            return false;
        }
        else {
            view.printMessage(View.USER_GUESSED);
            return true;
        }
    }
}
