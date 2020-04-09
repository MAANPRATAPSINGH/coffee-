
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
    public static void main(String[] args) {

        do {
            System.out.println(curStatus);
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    curStatus = Status.BUYING;
                    System.out.println(curStatus);
                    buy();
                    break;
                case "fill":
                    curStatus = Status.FILLING;
                    System.out.println(curStatus);
                    fill();
                    break;
                case "take":
                    curStatus = Status.TAKING;
                    System.out.println(curStatus);
                    take();
                    break;
                case "remaining":
                    curStatus = Status.REMAINING;
                    System.out.println(curStatus);
                    remaining();
                    break;
                case "exit":
                    exit();
                    System.out.println(curStatus);
                    break;
            }
        } while (curStatus != Status.EXITING);
    }



