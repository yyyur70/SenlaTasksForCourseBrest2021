package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputTextAndVowelHandling implements Runnable {
    @Override
    public void run() {
        try (BufferedReader sr = new BufferedReader (new InputStreamReader(System.in))) {
            System.out.print("Enter text:  ");
            String[] words = sr.readLine().split(" ");

            List<HandlingAndCountVowel> wordsTextList = new ArrayList<>();

            for (String word : words) {
                wordsTextList.add(new HandlingAndCountVowel (word));
            }
            System.out.println();

            wordsTextList.sort((o1, o2) -> {
                if (o1.getVowelsCount() == o2.getVowelsCount()) {
                    return 0;
                } else if (o1.getVowelsCount() < o2.getVowelsCount()) {
                    return 1;
                }
                return -1;
            });

            wordsTextList.forEach(
                    wordsText -> System.out.println(
                            String.format("Слово - %s, количество гласных = %d",
                                    wordsText.getWordWithFirstVowelInUpperCase(),
                                    wordsText.getVowelsCount())));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

