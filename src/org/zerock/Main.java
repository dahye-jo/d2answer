package org.zerock;

public class Main {

    public static void main(String[] args) {

        int winCount = 0;
        String lastWinner = "";

        while(true){

            String winner = SGPGame.doGame();

            System.out.println("winner: " + winner);

            if(winner.equals("D")){
                System.out.println("비겼으므로 다시 합니다.");
                continue;
            }

            if(lastWinner.equals(winner)){
                winCount += 1;
            }else{
                lastWinner = winner;
                winCount = 1;
            }
            winCount++;

            if(winCount == 3){
                break;
            }

        }

    }
}
