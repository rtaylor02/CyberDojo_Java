package com.rtaylor02.number_names;

/**
 * App main class
 * @author Rodney Taylor
 */
public class App {
    /**
     * @param number number input
     *
     * @return String representation of the number
     */
    public String giveNumberText(int number) {
        return switch (number) {
            case 1 -> "one";
            case 10 -> "ten";
            default -> "not sure";
        };
    }
}
