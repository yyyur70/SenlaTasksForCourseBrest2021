package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsInString {

    public static void main(String[] args) throws IOException {
        char c ;
        int res = 0;
        try (BufferedReader sr = new BufferedReader (new InputStreamReader(System.in))) {
            System.out.print("Enter text:  ");
            while ((c = (char)sr.read()) != '\n') {

                if (Character.isDigit(c)) {
                    int y = Character.getNumericValue(c);
                    res += y; }
            }
            System.out.println("Total sum of digits = " + res);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

