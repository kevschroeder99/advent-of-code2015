import day01.Navigator;
import day02.WrappingPaperCalculator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Day 1
        Navigator navigator = new Navigator();
        navigator.execute();

        // Day 2
        WrappingPaperCalculator calculator = new WrappingPaperCalculator();
        calculator.getWrappingPaperSurface();
    }
}
