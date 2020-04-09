
import java.util.Scanner;

public class coffeeMachine {
    static int WATER = 400;
    static int MILK = 540;
    static int BEANS = 120;
    static int CUPS = 9;
    static int money = 550;
    static Boolean exit = false;

    static Scanner scanner = new Scanner(System.in);

    enum Status {
        CHOOSING, BUYING, FILLING, TAKING, REMAINING, EXITING
    }
    static Status curStatus = Status.CHOOSING;
}



