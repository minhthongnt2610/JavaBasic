import java.util.Scanner;

public class GameBasicOne {
      private   String userPick;
        private String computerPick;
        private String result;
        public String getComputerPick(){
            String computerPick;
            int randomNumber = (int)(Math.random()*3)+1;
            if(randomNumber == 1)
                computerPick = "rock";
            else if(randomNumber == 2)
                computerPick = "paper";
            else
                computerPick = "scissors";
            return computerPick;
        }
        public String getUserPick(){
            String userPick;
            Scanner input = new Scanner(System.in);
            while (true){

                System.out.println("Please Enter rock, paper, scissors:  ");
                userPick = input.nextLine();
                if(userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors") )
                    break;
            }
            return userPick;
        }
        public String getResult(String userPick, String computerPick){
            if(userPick.equals(computerPick))
                return "Draw";
            else if(userPick.equals("rock") && computerPick.equals("scissors"))
                return "Win";
            else if(userPick.equals("rock") && computerPick.equals("paper"))
                return "Win";
            else if(userPick.equals("scissors") && computerPick.equals("paper"))
                return "Win";
            else return "Lost";
        }
    }




