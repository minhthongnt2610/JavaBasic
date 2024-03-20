import java.util.Scanner;

public class Game {
    Board board = new Board();

    Player player = new Player("X");
    Player player1 = new Player("O");
    Player currentPlayer = player;
    void setPlay(){
        String massage = "Please enter the position (1-9): ";
        while (true){
            //massage = "Please enter the position (1-9): ";
            Scanner input = new Scanner(System.in);
            System.out.println(currentPlayer.name + " "+massage);
            int position = input.nextInt();
            if(board.updateBoard(position, currentPlayer.type))
                board.printBoard();
            if(board.checkDraw())
                System.out.println("Draw");
            else if(board.checkWin(currentPlayer.type)){
                System.out.println(currentPlayer.name + " Winnnnn , very well!");
                break;
            }
            else{
            if(currentPlayer == player)
                currentPlayer = player1;
            else
                currentPlayer = player;
        }}
    }
}
