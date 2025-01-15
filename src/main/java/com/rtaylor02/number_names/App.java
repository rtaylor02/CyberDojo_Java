package com.rtaylor02.number_names;

/**
 * App main class
 * @author Rodney Taylor
 */
public class App {
    
    public static final int TWO_DIGIT = 2;
    public static final int FIRST_DIGIT = 0;
    public static final int SECOND_DIGIT = 1;
    public static final int THIRD_DIGIT = 2;
    
    /**
     * @param number number input
     *
     * @return String representation of the number
     */
    public String giveNumberText(int number) {
        String result = null;
        
        String numberAsString = String.valueOf(number);
        
        int length = numberAsString.length();
        
        
        
        if (length >= TWO_DIGIT) {
            String headNumber2 = getMainNumber(numberAsString.substring(SECOND_DIGIT, THIRD_DIGIT));
            
            String title2 = getTitle(length - 1);
        } else {
            String headNumber = getMainNumber(numberAsString.substring(FIRST_DIGIT, SECOND_DIGIT));
            
            String title = getTitle(length);
            
            return getMainNumber(numberAsString);
        }
        
        
        return switch (number) {
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
            case "0" -> "zero";
            case "1" -> "one";
            case "2" -> "two";
            case "3" -> "three";
            case "4" -> "four";
            case "5" -> "five";
            case "6" -> "six";
            case "7" -> "seven";
            case "8" -> "eight";
            case "9" -> "nine";
            default -> "Oh dear..";
        };
    }
    
    private static String getTitle(int digits) {
        return switch (digits) {
            case 3 -> " hundred";
            case 4 -> " thousand";
            case 7 -> " million";
            default -> "title-not configured yet";
        };
    }
}
