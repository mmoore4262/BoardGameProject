public class Runner {
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        //initialize board to hold any number of BoardSpaces
        BoardSpaces[][] board = new BoardSpaces[10][5];
        //fill the board indexes with normal BoardSpaces
        for (int x=0; x<board.length; x++)
        {
            for (int y=0; y<board[x].length; y++)
            {
                //board now holds [x] sets of [y] sets of BoardSpaces
                board[x][y]=new BoardSpaces(x,y);
            }
        }

        Player avatar= new Player("Place", "Holder");



    }
}
