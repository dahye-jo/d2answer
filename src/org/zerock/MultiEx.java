package org.zerock;

public class MultiEx {

    public static void main(String[] args) {

        int[][] arr = new int[5][];

        int[] temp1 = {1,2,3};

        arr[0] = temp1;

        arr[1] = new int[]{10,20,30,40,50};

        System.out.println(arr);

        System.out.println(arr[0]);


    }
}
