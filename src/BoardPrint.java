abstract public class BoardPrint {
    private BoardSpaces[][] board;

    public BoardPrint(BoardSpaces[][] board)
    {
        this.board=board;
    }
    public void print()
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
