package com.carlosguemes;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<List<Integer>> matrix = Arrays.asList(
//                Arrays.asList(1, 2, 3, 4, 5, 6),
//                Arrays.asList(7, 8, 9, 10, 11, 12),
//                Arrays.asList(1, 1, 1, 0, 0, 0),
//                Arrays.asList(0, 0, 2, 4, 4, 0),
//                Arrays.asList(0, 0, 0, 2, 0, 0),
//                Arrays.asList(0, 0, 1, 2, 4, 0));

        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(-1, -1, 0, -9, -2, -2),
                Arrays.asList(-2, -1, -6, -8, -2, -5),
                Arrays.asList(-1, -1, -1, -2, -3, -4),
                Arrays.asList(-1, -9, -2, -4, -4, -5),
                Arrays.asList(-7, -3, -3, -2, -9, -9),
                Arrays.asList(-1, -3, -1, -2, -4, -5));

//        if (j == 2) {
//            j = 1;
//            i = 1;
//            num = arr.get(i).get(j);
//            biggest += num;
//
//        }

//        System.out.println(matrix);

        System.out.println(hourglassSum(matrix));
    }

    public static int hourglassSum(List<List<Integer>> arr) {

        int sum = 0;
        int rowCounter = 0;
        int sumCounter = 0;
        int result = Integer.MIN_VALUE;
        int quadrant = 0;

        for (int i=0; i < arr.size(); i++) {
            for (int j=0; j < arr.size(); j++) {
                sum += arr.get(i).get(j);
                sumCounter++;
                rowCounter++;
                if (sumCounter == 7) {
                    sumCounter = 0;
                    if (sum > result) {
                        result = sum;
                    }
                    sum = 0;
                    i -= 2;
                    j -= 2;
                    rowCounter = 0;
                    quadrant++;
                    if (quadrant == 4) {
                        if (i==3 && j == 3) {
                            i=5;
                            j=5;
                        } else {
                            i++;
                            j = -1;
                            quadrant = 0;
                        }
                    }

                }
                if (rowCounter==3) {
                    i++;
                    j -= 1;
                    sum += arr.get(i).get(j);
                    rowCounter = 0;
                    sumCounter++;
                    i++;
                    j -= 2;

                }
            }

        }

        return result;
    }

}
