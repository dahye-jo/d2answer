package org.zerock.quiz;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class QuizMain {

    //bad code
    public static void main(String[] args) throws Exception{

        //퀴즈 종류를 보여준다.
        System.out.println("1.나라이름, 2.Movie, 3.Idol, 4.Actor/Actress, 5.New Terms ");

        Scanner scanner = new Scanner(System.in);
        //사용자에게 입력을 받아야 한다.
        String choice = scanner.nextLine();

        //해당 파일을 로딩한다.
        FileInputStream fin =
                new FileInputStream("C:\\zzz\\quiz"+choice+".txt");
        Scanner fileScanner =
                new Scanner(fin);

        //한 라인을 읽는다. ----1
        while(true){


            String line = fileScanner.nextLine();
            //System.out.println(line);

            //QuizVO 인스턴스 생성
            String[] arr = line.split(",");
            //System.out.println(Arrays.toString(arr));

            QuizVO quizVO = new QuizVO(arr[0],arr[1], Integer.parseInt(arr[2].trim()));

            //System.out.println(quizVO);

            //QuizVO에게 문제를 얻어와서 출력
            System.out.println(quizVO.getQuestion());

            //QuizVO에게 보기를 얻어와서 출력
            System.out.println(quizVO.getOptions());

            //사용자가 정답을 입력한다.
            String userInput = scanner.nextLine();

            //숫자로 만들어서 정답을 체크한다.
            boolean result = quizVO.checkAnswer(Integer.parseInt(userInput));

            System.out.println(result);

            //정답이면... 1부터 반복
            if(result == false){
                System.out.println("격한 말..차마 입에 담을 수 없는 ");
                break;
            }

        }//end while
    }
}
