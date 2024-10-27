package day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        List<Integer> sizeList = Arrays.asList(this.length, this.width, this.height);
        //Liste sortieren, da 'The ribbon required to wrap a present is the shortest distance around its sides,
        // or the smallest perimeter of any one face'
        Collections.sort(sizeList);
        int length = 2 * sizeList.get(0);
        int width = 2 * sizeList.get(1);

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
