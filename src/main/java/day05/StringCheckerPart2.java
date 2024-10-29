package day05;

import util.CustomReader;

public class StringCheckerPart2 {

    public final String PATH_TO_INPUT = "src/main/resources/inputs/day05_input.txt";

    public void checkString() throws Exception {
        String file = CustomReader.readFile(PATH_TO_INPUT);

        String[] strings = file.split("\n");

        int counter = 0;
        for (String s : strings) {
            if (checkLetterPairs(s) && checkRepeatingLetters(s)) {
                counter++;
            }
        }
        System.out.println("Day 5#2 - Nice Strings: " + counter);
    }

    private boolean checkRepeatingLetters(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 2; i++) {
            char current = chars[i];
            char between = chars[i + 1];
            char next = chars[i + 2];
            if (current == next && current != between) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLetterPairs(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            String pair1 = chars[i] + "" + chars[i + 1];

            for (int j = i; j < chars.length - 3; j++) {
                String pair2 = chars[j + 2] + "" + chars[j + 3];

                if (pair1.equals(pair2)) {
                    return true;
                }
            }
        }
        return false;
    }


}
