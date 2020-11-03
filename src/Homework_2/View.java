package Homework_2;

public class View {
    public static final String USER_INPUT = "Please, enter a positive number: ";
    public static final String PROGRAM_GUESS = "Program choose the number! Try to guess.";
    public static final String NUMBER_IS_SMALLER = "Number is too small!";
    public static final String NUMBER_IS_GREATER = "Number is too large!";
    public static final String USER_GUESSED = "You guess the number!";
    public static final String NOT_A_NUMBER = "You should enter a number!";
    public static final String USER_TRIES = "Your tries are: ";

    public void printMessage(String message){
        System.out.println(message);
    }
}
