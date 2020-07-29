package org.zerock;

import java.util.Arrays;

public class CopyUtil {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[4];

        System.arraycopy(arr,0, arr2, 0, 2);

        System.out.println(Arrays.toString(arr2));

        System.arraycopy(arr,3,arr2,2, 2);


        System.out.println(Arrays.toString(arr2));

        arr = arr2;

        System.out.println(Arrays.toString(arr));


    }
}
