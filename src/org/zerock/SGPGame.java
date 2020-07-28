package org.zerock;

import java.util.Scanner;

public class SGPGame {



    public static String doGame() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("가위 0, 바위 1, 보 2 ");
        int userValue = Integer.parseInt(scanner.nextLine()) % 3;

        int comValue = (int)(Math.random() * 3);


        if(comValue < userValue){
            comValue += 3;
        }

        System.out.println("COM: " + comValue +" USER: " + userValue );

        int gap = comValue - userValue;

        if(gap == 1){
            return "C";
        }else if(gap == 2){
            return "U";
        }

        return "D";

    }

}
