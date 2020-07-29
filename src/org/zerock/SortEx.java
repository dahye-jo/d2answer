package org.zerock;

import java.util.Arrays;

public class SortEx {

    public static void main(String[] args) {

        double[][] arr = {{1,1},{5,5},{10,10}};

        double x = 9;
        double y = 9;

        Arrays.sort(arr, (o1, o2) -> {
            double d1 = Math.sqrt(Math.pow(x - o1[0],2) + Math.pow(y - o1[1],2));
            double d2 = Math.sqrt(Math.pow(x - o2[0],2) + Math.pow(y - o2[1],2));
            return d1>d2? 1: -1;
        });


        System.out.println("---------------------");

        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }



    }
}
