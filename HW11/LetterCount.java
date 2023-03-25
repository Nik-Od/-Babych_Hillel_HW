package HW11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        Map<Character, Integer> letterCounts = countLetters(sentence);
        printLetterCounts(letterCounts);
    }

    private static Map<Character, Integer> countLetters(String sentence) {
        Map<Character, Integer> letterCounts = new HashMap<>();
        String lowerCaseSentence = sentence.toLowerCase();

        for (char letter : lowerCaseSentence.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
            }
        }

        return letterCounts;
    }

    private static void printLetterCounts(Map<Character, Integer> letterCounts) {
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.printf("Letter '%c' occurs %d times\n", entry.getKey(), entry.getValue());
        }
    }
}

