package Homework_1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        model.setFirstValue(inputValueWithScanner(scanner, View.HELLO));
        model.setSecondValue(inputValueWithScanner(scanner, View.WORLD));
        view.printMessage(model.getFirstValue(), model.getSecondValue());
    }
    public String inputValueWithScanner(Scanner scanner, String valueToCompare){

        view.printMessage(View.USER_INPUT);
        String userInput = scanner.nextLine();
        while(!userInput.equals(valueToCompare)){
            view.printMessage(View.WRONG_DATA);
            userInput = scanner.nextLine();
        }
        return userInput;
    }
}
