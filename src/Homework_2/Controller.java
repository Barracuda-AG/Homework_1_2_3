package Homework_2;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        boolean flag;
        view.printMessage(View.PROGRAM_GUESS);
        model.setRandomNumber(model.rand(0, 100));
        Scanner scanner = new Scanner(System.in);
        do {
            model.setUserNumbers(inputValueWithScanner(scanner));
            flag = model.checkUserNumber(model.getUserNumbers().get(model.getUserNumbers().size() - 1));
            getMessage();
        } while (!flag);
        view.printMessage(View.USER_GUESSED);
        view.printMessage(View.USER_TRIES);
        view.printMessage(model.getUserNumbers().toString());
    }

    public int inputValueWithScanner(Scanner scanner) {
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

    public void getMessage() {
        int userInput = model.getUserNumbers().get(model.getUserNumbers().size() - 1);
        if (userInput > model.getRandomNumber()) {
            view.printMessage(View.NUMBER_IS_GREATER);
            view.printMessage(View.RANGE + model.getMinValue() + View.AND + model.getMaxValue());
        } else if (userInput < model.getRandomNumber()) {
            view.printMessage(View.NUMBER_IS_SMALLER);
            view.printMessage(View.RANGE + model.getMinValue() + View.AND + model.getMaxValue());
        }
    }
}
