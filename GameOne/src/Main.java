
public class Main {
    public static void main(String[] args) {

           GameBasicOne game = new GameBasicOne();
           String userPick = game.getUserPick();
           String computerPick  = game.getComputerPick();
           String result = game.getResult(userPick,computerPick);
           System.out.println("Result of user is: "+ userPick);
           System.out.println("Result of computers is: "+ computerPick);
           System.out.println("Final result: "+result);

       }
    }
}