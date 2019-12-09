package com.javalesson.innerclasses;

public class Display {

    private final int DISPLAY_HEIGHT = 1920;
    private final int DISPLAY_WIDTH = 1280;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    public class Pixel {
        private int x;
        private int y;
        Color color;

        public Pixel(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }
}
