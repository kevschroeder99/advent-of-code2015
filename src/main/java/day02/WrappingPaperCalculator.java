package day02;

import util.CustomReader;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WrappingPaperCalculator {

    public final String PATH_TO_INPUT = "src/main/resources/inputs/day02_input.txt";

    public void getWrappingPaperSurface() throws IOException {
        PresentBox box;
        List<Integer> wrappingPaper = new ArrayList<>();
        List<Integer> ribbonSize = new ArrayList<>();
        String file = CustomReader.readFile(PATH_TO_INPUT);

        String[] present = file.split("\n");

        for (int i = 0; i < present.length; i++) {
            String[] presentSize = present[i].split("x");
            String length = presentSize[0];
            String width = presentSize[1];
            String height = presentSize[2];
            box = new PresentBox(Integer.parseInt(length), Integer.parseInt(width), Integer.parseInt(height));

            Integer neededWrappingPaper = box.getWarppingPaperSurface();
            wrappingPaper.add(neededWrappingPaper);
            Integer neededRibbon = box.getRibbonForPresent();
            ribbonSize.add(neededRibbon);
        }
        System.out.println("Day 2#1 - Wrapping Paper: " + wrappingPaper.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Day 2#2 - Ribbon: " + ribbonSize.stream().mapToInt(Integer::intValue).sum());
    }
}
