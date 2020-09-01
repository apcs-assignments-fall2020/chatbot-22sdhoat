import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
		String name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.print("What is your favorite color? ");
        String color = scan.next();
        System.out.println(color + ", is a pretty epic color!");
        System.out.print("What is your favorite food? ");
        String food = scan.next();
        System.out.println(food + ", is delicious!");
        System.out.print("How many siblings do you have? ");
        String number = scan.next();
        int siblings = Integer.parseInt(number);
        System.out.println("Oh, you have " + siblings + "siblings, I have 1.");
        System.out.print("What's your favorite number? ");
        String favorite = scan.next();
        int x = Integer.parseInt(favorite);
        System.out.println("Though " + x + "is cool, 29 is a chad number.");
        scan.close();
    }
}
