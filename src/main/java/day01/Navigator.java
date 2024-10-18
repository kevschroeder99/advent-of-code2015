package day01;

import util.CustomReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Navigator {

    public final String PATH_TO_INPUT = "src/main/resources/inputs/day01_input.txt";

    public void execute() throws IOException {
        String file = CustomReader.readFile(PATH_TO_INPUT);
        char[] charArray = file.toCharArray();
        Building building = new Building();
        List<Integer> integerList = new ArrayList<>();
        int position = 1;
        for (char c : charArray) {
            if ("(".equals(Character.toString(c))) {
                building.goUpOneFloor();
            }
            if (")".equals(Character.toString(c))) {
                building.goDownOneFloor();
            }
            if (building.floorLevel == -1) {
                integerList.add(position);
            }
            position++;
        }

        System.out.println("Day 1#1 - Level: " + building.floorLevel);
        System.out.println("Day 1#2 - Position: " + integerList.get(0));
    }
}

