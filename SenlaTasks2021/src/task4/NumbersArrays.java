package task4;

import java.util.HashMap;
import java.util.Map;

public class NumbersArrays {
    static Map <Character, String[][]> integerPatternMap = new HashMap<>();

    private static final String[][] num0 = {
            {" ", "0", "0", "0", "0", " "},
            {" ", "0", " ", " ", "0", " "},
            {" ", "0", " ", " ", "0", " "},
            {" ", "0", " ", " ", "0", " "},
            {" ", "0", "0", "0", "0", " "},
    };
    private static final String[][] num1 = {
            {" ", " ", " ", "1", " ", " "},
            {" ", " ", "1", "1", " ", " "},
            {" ", "1", " ", "1", " ", " "},
            {" ", " ", " ", "1", " ", " "},
            {" ", " ", " ", "1", " ", " "},
    };

    private static final String[][] num2 = {
            {" ", "2", "2", "2", "2", " "},
            {" ", " ", " ", " ", "2", " "},
            {" ", "2", "2", "2", "2", " "},
            {" ", "2", " ", " ", " ", " "},
            {" ", "2", "2", "2", "2", " "},
    };
    private static final String[][] num3 = {
            {" ", "3", "3", "3", "3", " "},
            {" ", " ", " ", " ", "3", " "},
            {" ", " ", " ", "3", " ", " "},
            {" ", " ", " ", " ", "3", " "},
            {" ", "3", "3", "3", "3", " "},
    };
    private static final String[][] num4 = {
            {" ", "4", " ", " ", "4", " "},
            {" ", "4", " ", " ", "4", " "},
            {" ", "4", "4", "4", "4", " "},
            {" ", " ", " ", " ", "4", " "},
            {" ", " ", " ", " ", "4", " "},
    };
    private static final String[][] num5 = {
            {" ", "5", "5", "5", "5", " "},
            {" ", "5", " ", " ", " ", " "},
            {" ", "5", "5", "5", "5", " "},
            {" ", " ", " ", " ", "5", " "},
            {" ", "5", "5", "5", "5", " "},
    };
    private static final String[][] num6 = {
            {" ", "6", "6", "6", "6", " "},
            {" ", "6", " ", " ", " ", " "},
            {" ", "6", "6", "6", "6", " "},
            {" ", "6", " ", " ", "6", " "},
            {" ", "6", "6", "6", "6", " "},
    };
    private static final String[][] num7 = {
            {" ", "7", "7", "7", "7", " "},
            {" ", " ", " ", "7", " ", " "},
            {" ", " ", "7", " ", " ", " "},
            {" ", "7", " ", " ", " ", " "},
            {" ", "7", " ", " ", " ", " "},
    };
    private static final String[][] num8 = {
            {" ", "8", "8", "8", "8", " "},
            {" ", "8", " ", " ", "8", " "},
            {" ", "8", "8", "8", "8", " "},
            {" ", "8", " ", " ", "8", " "},
            {" ", "8", "8", "8", "8", " "},
    };
    private static final String[][] num9 = {
            {" ", "9", "9", "9", "9", " "},
            {" ", "9", " ", " ", "9", " "},
            {" ", "9", "9", "9", "9", " "},
            {" ", " ", " ", " ", "9", " "},
            {" ", "9", "9", "9", "9", " "},
    };

    static {
        integerPatternMap.put('0', num0);
        integerPatternMap.put('1', num1);
        integerPatternMap.put('2', num2);
        integerPatternMap.put('3', num3);
        integerPatternMap.put('4', num4);
        integerPatternMap.put('5', num5);
        integerPatternMap.put('6', num6);
        integerPatternMap.put('7', num7);
        integerPatternMap.put('8', num8);
        integerPatternMap.put('9', num9);
    }

    public static Map<Character, String[][]> getIntegerPatternMap() {
        return integerPatternMap;
    }
}
