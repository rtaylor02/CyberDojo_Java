package com.rtaylor02.calc_stats;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String ss = extracted();
        String sss = ss == null ? "null" : ss;
        System.out.println(sss);
    }

    private static String extracted() {
        String s = null;
        try {
            Path path = Paths.get(null);
            s = "Rod";
        } catch (Throwable e) {
            throw e;
        }

        return s;
    }
}
