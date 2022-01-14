package com.carlosguemes;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> magazine = Arrays.asList("apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg");
//        List<String> note = Arrays.asList("elo", "lxkvg", "bg", "mwz", "clm", "w");
        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");



        HashTablesRansomNote.checkMagazine(magazine, note);
    }
}
