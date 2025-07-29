public class TicTacApp {
    private static TicTacApp instance;
    private Board board;
    private Player player1;
    private Player player2;

    public static synchronized TicTacApp getInstance()
    {
        if(instance==null)
        {
            instance=new TicTacApp();

        }
        return instance;
    }
    public TicTacApp() {
        this.board = new Board();
        this.player1 = new Player("1","Zeeshan",Sign.O);
        this.player2 = new Player("2","Parath",Sign.X);
    }

    void printBoard()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(board.getBoard()[i][j]+" | ");
            }
            System.out.println("");
            System.out.println("____________________");
        }
    }
    void playerMove(int row, int col,Player player)
    {
        if(row<0 || row>=3 ||col<0 || col>=3)
        {
            System.out.println("Incorrect Move");
            return;
        }
        if(board.getBoard()[row][col]!=null)
        {
            System.out.println("Incorrect Move");
            return;
        }
        Sign sign= player.getSign();
        System.out.println("Player "+ player.getName() +" Played "+sign +"at" + row+" " +col);
        board.getBoard()[row][col]=sign;
        boolean win=checkWinner(player,sign);
        if(win==true)
        {
            System.out.println("Player" + player.getName() + "WINs");
            printBoard();
            return;
        }
        printBoard();

    }
    public boolean checkWinner(Player player,Sign sign)
    {
        Sign[][] b = board.getBoard();

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == sign && b[i][1] == sign && b[i][2] == sign) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (b[0][j] == sign && b[1][j] == sign && b[2][j] == sign) {
                return true;
            }
        }

        // Check main diagonal
        if (b[0][0] == sign && b[1][1] == sign && b[2][2] == sign) {
            return true;
        }

        // Check anti-diagonal
        if (b[0][2] == sign && b[1][1] == sign && b[2][0] == sign) {
            return true;
        }

        // No winner
        return false;
    }
    void playGame()
    {
        playerMove(0, 0, player1);  // Zeeshan plays O
        playerMove(0, 1, player2);  // Parath plays X
        playerMove(1, 1, player1);  // Zeeshan plays O
        playerMove(1, 0, player2);  // Parath plays X
        playerMove(2, 2, player1);
    }
}
