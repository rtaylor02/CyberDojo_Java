package com.rtaylor02.number_names;

public class App {
    public String giveNumberText(int number) {
        return switch (number) {
            case 1 -> "one";
            case 10 -> "ten";
            default -> "not sure";
        };
    }
}
