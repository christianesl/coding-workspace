
public class TicTacTow {

    private char[][] board;

    public TicTacTow() {
        board = new char[3][5];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (col == 1 || col == 3) {
                    board[row][col] = '|';
                } else {
                    board[row][col] = '-';
                }
            }
        }
    }

    public void display() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    public void play(int posRow, int posCol, char symbol) {
        try {
            // input validation
            if (posRow >= 0 || posRow < board.length || posCol >= 0 || posCol < board[0].length) {
                if (symbol == 'X' || symbol == 'O') {
                    board[posRow][posCol] = symbol;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public boolean isFull() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public void computerPlay() {
//        display();
        if (!isFull()) {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[0].length; col++) {
                    if (board[row][col] == '-') {
                        board[row][col] = 'O';
                    } // if
                }
            }// outer loop
        } else{
            throw new IllegalArgumentException("already full");
        }
    }


    public static void main(String[] args) {
        TicTacTow game = new TicTacTow();
        System.out.println("is board full already? " + game.isFull());
        game.play(0, 2, 'X');
        game.play(2, 2, 'O');
        game.display();
        System.out.println();
        System.out.println("is board full already? " + game.isFull());
        for(int i = 0; i < 6 ; i++){
            game.computerPlay();
        }
        game.display();
        System.out.println("is board full already? " + game.isFull());
    }
}
