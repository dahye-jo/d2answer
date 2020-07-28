package org.zerock;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        System.out.println("주간 근로 시간을 입력해 주세요");

        Scanner scanner = new Scanner(System.in);

        int workHour = Integer.parseInt(scanner.nextLine());

        if(workHour < 20 || workHour > 65){
            System.out.println("정상적인 범위가 아닙니다");
            return;
        }

        double salary = workHour * 12.0;

        System.out.println(salary);


    }
}
