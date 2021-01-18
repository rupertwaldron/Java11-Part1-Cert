package com.ruppyrup.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImageTest {
    public static void main(String[] args) {
        List<Image> images = new ArrayList<>();
        images.add(new Image(80, 100));
        images.add(new Image(200, 100));
        images.add(new Image(100, 200));
        images.add(new Image(120, 120));
        images.add(new Image(100, 70));

        Predicate<Image> widthCheck = image -> image.getWidth() >= 100;
        Predicate<Image> heightCheck = image -> image.getHeight() >= 100;

        var imageList = images.stream()
            .filter(widthCheck.and(heightCheck))
            .collect(Collectors.toList());

        System.out.println(imageList);

    }
}

class Image {
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Image{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }
}
