// Create a double Boardspaces array; Boardspaces[][], and name it board. Initialize the array- board, with any ints. 5,5; 10,6; 8,32; etc. Fill the board with boardspaces
//Matthew Moore
public class BoardSpaces {
    //fields
    // x and y are the number of horizontal and vertical spaces of the board.
    //Will probably need a player field soon.
    private int x;
    private int y;
    private int gSpace;
    private Player p;
    private  BoardSpaces[][] board;
    public BoardSpaces (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    //When displayed on board, this is generic space
    public String toString()
    {
        return "[X]";
    }
    //Never used in runner, just to check if the lement in board is correct or nor
    public String returnType()
    {
        return "BS";
    }
    //returns the entire board space
    public void entireBoardSpace()
    {
        System.out.println(" 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");

        for (int y=0; y<10; y++)
        {
            for (int x=0; x<15; x++)
            {

                System.out.print(board[x][y].toString());
                if (x==14)
                {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }


}
