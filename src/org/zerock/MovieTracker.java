package org.zerock;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTracker {

    public static void main(String[] args) {

        Class clz = void.class;


        double[][] data = {
                {1.0, 60.0, 30.0},
                {1.0, 12.0, 3.0},
                {1.0, 6.0, 2.0},
                {2.0, 5.0, 13.0},
                {2.0, 12.0, 20.0},
                {2.0, 7.0, 8.0}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("키스씬의 숫자를 입력하세요");
        double kissCount = Double.parseDouble(scanner.nextLine());

        System.out.println("액션씬의 숫자를 입력하세요");
        double actionCount = Double.parseDouble(scanner.nextLine());

        System.out.println(kissCount + ": " + actionCount);

        Arrays.sort(data,(o1, o2) -> {

            double d1 = Math.sqrt( Math.pow( kissCount - o1[1]  , 2)  +
                       Math.pow( actionCount - o1[2]  , 2));
            double d2 = Math.sqrt( Math.pow( kissCount - o2[1]  , 2)  +
                    Math.pow( actionCount - o2[2]  , 2));
            return d1 > d2? 1: -1;
        });

        for(int i = 0; i < data.length; i++){

            System.out.println(Arrays.toString(data[i]));

        }


//        for (double[] movie:data) {
//
//            System.out.println(Arrays.toString(movie));
//
//            double distance = Math.sqrt( Math.pow( kissCount - movie[1]  , 2)  +
//                       Math.pow( actionCount - movie[2]  , 2));
//
//            System.out.println(distance);
//
//        }

    }
}
