package com.rtaylor02;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Character> list1 = new ArrayList<>(List.of('B', 'S', 'D', 'C', 'N', 'G', 'R', 'T', 'Q', 'F', 'J', 'H', 'V', 'A', 'O', 'E', 'F', 'L', 'P', 'Z'));
    private List<Character> list2 = new ArrayList<>(List.of('O', 'K', 'Q', 'P', 'A', 'T', 'E', 'G', 'D', 'S', 'W', 'U', 'I', 'N', 'B', 'R', 'S', 'Y', 'C', 'M'));

    public static void main(String[] args) {

    }

    public boolean canMakeWord(String word) {
        char[] chars = word.toCharArray();

        int found = 0; // Flag if each character from the word is found in the lists
        for (char aChar : chars) {
            // Check list 1 first
            int index = list1.indexOf(aChar);

            // Check list2 if list1 does not have the letter
            if (index == -1) {
                index = list2.indexOf(aChar);
            }

            // Remove found index from both list
            if (index >= 0) {
                list1.remove(index);
                list2.remove(index);
                found++;
            } else {
                break;
            }
        }

        return found == chars.length;
    }
}
