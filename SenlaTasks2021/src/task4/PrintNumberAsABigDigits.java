package task4;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintNumberAsABigDigits {
    public static void main(String[] args) {
        String numberAsString = readNumberAsStringFromConsole();

        List<String[][]> numbersAsPatterns = numberAsString.chars()
                .mapToObj(character -> NumbersArrays.getIntegerPatternMap().get((char) character))
                .collect(Collectors.toList());

        if (numbersAsPatterns.size() == 0) {
            return;
        }

        for (int i = 0; i < numbersAsPatterns.get(0).length; i++) {
            for (String[][] pattern : numbersAsPatterns) {
                System.out.print("   ");
                for(String str : pattern[i]) {
                    System.out.print(str);
                }
                System.out.print("   ");
            }
            System.out.println("");
        }

        System.out.println("");
    }

    private static String readNumberAsStringFromConsole() {
        Scanner in = new Scanner(System.in);
        String inputLine = in.next();

        try {
            Integer.parseInt(inputLine);
            return inputLine;
        } catch (NumberFormatException e) {
            System.out.println("Введите валидное число");
            return readNumberAsStringFromConsole();
        }
    }
}
