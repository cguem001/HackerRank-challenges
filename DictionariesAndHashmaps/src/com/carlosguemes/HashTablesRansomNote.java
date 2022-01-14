package com.carlosguemes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTablesRansomNote {
    /*
    Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his
    handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create
    an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole
    words available in the magazine. He cannot use substrings or concatenation to create the words he needs.
    Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note
    exactly using whole words from the magazine; otherwise, print No.

    Example
    magazine = "attack at dawn"  note = "Attack at dawn"

    The magazine has all the right words, but there is a case mismatch. The answer is .
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> magazineWords = new HashMap<String, Integer>();
        int flag = 1;

        for (int i = 0; i < magazine.size(); i++) {
            Integer wordCount = magazineWords.get(magazine.get(i));
            if (wordCount == null) {
                magazineWords.put(magazine.get(i), 1);
            } else {
                magazineWords.put(magazine.get(i), wordCount + 1);
            }
        }

        for (int i = 0; i < note.size(); i++) {
            Integer wordCount = magazineWords.get(note.get(i));
            if (wordCount == null || wordCount == 0) {
                flag = 0;
            } else {
                magazineWords.put(note.get(i), wordCount - 1);
            }
        }
        System.out.println((flag == 1) ? "Yes" : "No");



//        int counter = 0;

//        for (int i=0; i<note.size(); i++) {
//            for (int j=0; j<magazine.size(); j++) {
//                if (note.get(i) == magazine.get(j)) {
//                    counter++;
//                    magazine.set(j, null);
//                    j=0;
//                    if (note.size()-1 == i) {
//                        break;
//                    } else {
//                        i++;
//                    }
//                }
//            }
//        }

//        String result = (counter == note.size()) ? "Yes" : "No";
//        System.out.println(result);


    }


}
