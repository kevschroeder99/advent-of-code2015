package day05;

import util.CustomReader;

import java.util.Arrays;
import java.util.List;

public class StringCheckerPart1 {

    public final String PATH_TO_INPUT = "src/main/resources/inputs/day05_input.txt";

    public static final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    public static final List<String> illegalStrings = Arrays.asList("ab", "cd", "pq", "xy");

    public void checkString() throws Exception {
        String file = CustomReader.readFile(PATH_TO_INPUT);

        String[] strings = file.split("\n");

        int counter = 0;
        for (String s : strings) {
            if (checkVowels(s) && checkLetterAppearance(s) && !checkIllegalStrings(s)) {
                counter++;
            }
        }
        System.out.println("Day 5#1 - Nice Strings: " + counter);
    }


    //check if string does not contain specific strings
    private boolean checkIllegalStrings(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            char current = chars[i];
            char next = chars[i + 1];
            String stringCurrent = Character.toString(current);
            String stringNext = Character.toString(next);

            if (illegalStrings.contains(stringCurrent + stringNext)) {
                return true;
            }
        }
        return false;
    }

    //check if string has one letter that appears twice in a row
    private boolean checkLetterAppearance(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            char current = chars[i];
            char next = chars[i + 1];
            if (current == next) {
                return true;
            }
        }
        return false;
    }

    //check if string has atleast 3 vowels
    private boolean checkVowels(String s) {
        int enoughVowels = 0;
        char[] chars = s.toCharArray();

        for (Character c : chars) {
            if (vowels.contains(c)) {
                enoughVowels++;
            }
        }

        return enoughVowels >= 3;
    }

}
