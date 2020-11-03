public class View {
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";
    public static final String USER_INPUT = "Input word:";
    public static final String WRONG_DATA = "Wrong input! Please, try again!";

    public void printMessage(String ...message){
        if(message.length == 1) {
            System.out.println(message[0]);
        }
        else {
            System.out.println(message[0] + " " + message[1]);
        }
    }
}
