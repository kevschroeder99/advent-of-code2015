package day02;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class PresentBox {

    public int length;
    public int width;
    public int height;

    public PresentBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getWarppingPaperSurface() {
        int surfaceA = this.length * this.width;
        int surfaceB = this.width * this.height;
        int surfaceC = this.height * this.length;

        // Add Extra Wrapping Paper
        List<Integer> surfaceList = Arrays.asList(surfaceA, surfaceB, surfaceC);
        int extraSurface = surfaceList.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        return 2 * surfaceA + 2 * surfaceB + 2 * surfaceC + extraSurface;
    }

    public int getRibbonForPresent() {
        int length = this.length + this.length;
        int width = this.width + this.width;

        int bow = this.length * this.width * this.height;

        return length + width + bow;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
