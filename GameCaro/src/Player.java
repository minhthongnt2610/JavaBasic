import  java.util.Scanner;
public class Player {
    Scanner input = new Scanner(System.in);
    String name;
    String type;
    Player(String type){
        this.type = type;
        if(type == "X"){
            System.out.println("Player selecting X, enter your name: ");
            name = input.nextLine();
        }
        else{
            System.out.println("Player selecting O, enter your name: ");
            name = input.nextLine();
        }
    }
}
