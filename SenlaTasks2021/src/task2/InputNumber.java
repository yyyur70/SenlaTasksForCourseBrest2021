package task2;

import java.util.Scanner;

public class InputNumber {
    public static int getANumber() {
        int number = 0;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            System.out.print("Please enter an integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                valid = true;
            } else {
                System.out.print("Not a valid integer!\n");
                input.next();
            }
        } while (valid == false);
        return number;
    }
}
