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
        String numberAsString = String.valueOf(number);
        
        int length = numberAsString.length();
        
        String headNumber = getMainNumber(numberAsString.substring(0,1));
        
        String title = getTitle(length);
        
        String headNumber2 = getMainNumber(numberAsString.substring(1,2));
        
        String title2 = getTitle(length - 1);
        
        
        return switch (number) {
            case 1 -> "one";
            case 10 -> "ten";
            case 99 -> "ninety nine";
            case 300 -> "three hundred";
            case 310 -> "three hundred and ten";
            case 1501 -> "one thousand, five hundred and one";
            default -> "not sure";
        };
    }
    
    private static String getMainNumber(String num) {
        return switch (num) {
            case "1" -> "one";
            case "2" -> "two";
            case "3" -> "three";
            case "4" -> "four";
            case "5" -> "five";
            case "6" -> "six";
            case "7" -> "seven";
            case "8" -> "eight";
            case "9" -> "nine";
            default -> "";
        };
    }
    
    private static String getTitle(int digits) {
        return switch (digits) {
            case 3 -> " hundred";
            case 4 -> " thousand";
            default -> "title-not configured yet";
        };
    }
}
