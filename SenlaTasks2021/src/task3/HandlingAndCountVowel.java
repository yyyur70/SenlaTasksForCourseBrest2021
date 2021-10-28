package task3;

import java.util.Arrays;
import java.util.List;

public class HandlingAndCountVowel {
    private final List<Character> vowelsList = Arrays.asList('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я');
    private final String originalWord;
    private String wordWithFirstVowelInUpperCase;
    private Integer vowelsCount;



    public HandlingAndCountVowel(String originalWord) {
        this.originalWord = originalWord;
    }

    @Override
    public String toString() {
        return String.format("WordsText{word='%s,', count=%d}", wordWithFirstVowelInUpperCase, vowelsCount);
    }

    public int getVowelsCount() {
        if (vowelsCount != null) {
            return vowelsCount;
        }

        vowelsCount = 0;
        String word = originalWord.toLowerCase();
        for (Character character : word.toCharArray()) {
            if (vowelsList.contains(character)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public String getWordWithFirstVowelInUpperCase() {
        if (wordWithFirstVowelInUpperCase != null) {
            return wordWithFirstVowelInUpperCase;
        }

        char[] wordChars = originalWord.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
            if (vowelsList.contains(wordChars[i])) {
                wordChars[i] = Character.toUpperCase(wordChars[i]);
                break;
            }
        }
        wordWithFirstVowelInUpperCase = String.valueOf(wordChars);
        return wordWithFirstVowelInUpperCase;
    }
}
