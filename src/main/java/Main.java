import day01.Navigator;
import day02.WrappingPaperCalculator;
import day05.StringCheckerPart1;


public class Main {

    public static void main(String[] args) throws Exception {
        // Day 1
        Navigator navigator = new Navigator();
        navigator.execute();

        // Day 2
        WrappingPaperCalculator calculator = new WrappingPaperCalculator();
        calculator.getWrappingPaperSurface();

        // Day 5
        StringCheckerPart1 stringChecker = new StringCheckerPart1();
        stringChecker.checkString();
    }
}
