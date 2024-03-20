public class Board {
    String board[] = {" "," "," "," "," "," "," "," "," "};
    int count = 0;
    void printBoard(){
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }
    boolean updateBoard(int position, String type){
        if(board[position - 1] == " ")
        {
            board[position - 1] = type;
            count++;
            return true;
        }
        else {
            System.out.println("Position already selected. Select another position.");
            return false;
        }
    }
    boolean checkDraw(){
        if(count == 9)
            return true;
        else return false;
    }
    boolean checkWin(String type) {
        if ((board[0] == type && board[1] == type && board[2] == type)
                || (board[3] == type && board[4] == type && board[5] == type)
                || (board[6] == type && board[7] == type && board[8] == type)
                || (board[0] == type && board[3] == type && board[6] == type)
                || (board[1] == type && board[4] == type && board[7] == type)
                || (board[2] == type && board[5] == type && board[8] == type)
                || (board[0] == type && board[4] == type && board[8] == type)
                || (board[2] == type && board[4] == type && board[6] == type))
            return true;
        else
            return false;
    }
}

