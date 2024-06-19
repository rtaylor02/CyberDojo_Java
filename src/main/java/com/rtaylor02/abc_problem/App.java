package com.rtaylor02.abc_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class App {
    private List<Character> list1 = new ArrayList<>(List.of('B', 'S', 'D', 'C', 'N', 'G', 'R', 'T', 'Q', 'F', 'J', 'H', 'V', 'A', 'O', 'E', 'F', 'L', 'P', 'Z'));
    private List<Character> list2 = new ArrayList<>(List.of('O', 'K', 'Q', 'P', 'A', 'T', 'E', 'G', 'D', 'S', 'W', 'U', 'I', 'N', 'B', 'R', 'S', 'Y', 'C', 'M'));

    public static void main(String[] args) {
        new App().canMakeWord_solution(null, null);
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

    public boolean canMakeWord_solution(String word, List<String> blocks) {
        if (word.isEmpty()) {
            return true;
        }

        char c = word.charAt(0);
        for (int i = 0; i < blocks.size(); i++) {
            String s = blocks.get(i);
            if (s.charAt(0) != c && s.charAt(1) != c) { // TODO: try if you can change this logic using String's contains(). A: use string.indexOf(char) is better.
                continue;
            }

            // Only swap when s contains c
            System.out.println("Top swap");
            Collections.swap(blocks, 0, i); // This is a way of getting rid of the block being used
            if (canMakeWord_solution(word.substring(1), blocks.subList(1, blocks.size()))) {
                return true;
            }
            return false;
            //System.out.println("Bottom swap");
            //Collections.swap(blocks, 0, i); // TODO: find out why bottom swap is needed? My first impression is that it's not needed. A: correct. It's not needed - put 'return false' instead.
        }

        return false;
    }

    public boolean canMakeWord_optimisedSolution(String word, List<String> blocks) {
        if (word.isEmpty()) {
            return true;
        }

        int found = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Optional<String> optional = blocks.subList(found, blocks.size()).stream().filter(s -> s.indexOf(c) != -1).findFirst();
            if (optional.isPresent()) {
                Collections.swap(blocks, found, blocks.indexOf(optional.get()));
                found++;
            } else {
                return false;
            }
        }

        return found == word.length();
    }
}