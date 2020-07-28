package org.zerock;

import java.util.Scanner;

public class HighLowGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;

        while(true){
            int mid = (min + max) /2;

            System.out.println("GUESS: " +mid);

            String userAnswer = scanner.nextLine();

            if(userAnswer.equals("H")){
                min = mid + 1;
            }else if(userAnswer.equals("L")){
                max = mid -1;
            }else if(userAnswer.equals("C")){
                System.out.println("OKKKK");
                break;
            }


        }

    }
}
