package Homework_2;

public class View {
    public static final String USER_INPUT = "Please, enter a positive number: ";
    public static final String PROGRAM_GUESS = "Program choose the number! Try to guess.";
    public static final String NUMBER_IS_SMALLER = "Number is too small!";
    public static final String NUMBER_IS_GREATER = "Number is too large!";
    public static final String USER_GUESSED = "You guessed the number!";
    public static final String NOT_A_NUMBER = "You should enter a number!";
    public static final String USER_TRIES = "Your tries are: ";
    public static final String RANGE = "The range is between ";
    public static final String AND = " and ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
