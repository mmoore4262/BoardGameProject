//Matthew Moore
import java.util.Scanner;

public class Player extends BoardSpaces {
    private GoblinSpace[] gSpaces;
    private int xLoc;
    private int yLoc;

    public Player (int x, int y)
    {
        super(x,y);
        this.xLoc=x;
        this.yLoc=y;
    }
    public int returnX()
    {
        return this.xLoc;
    }
    public int returnY()
    {
        return this.yLoc;
    }
    public String toString()
    {
        return "[P]";
    }
    //REturns the board array in a coordinate format.
    public void boardOut(BoardSpaces[][] board)
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
    //Takes user input to change the position of the player.
    public void changePosition(BoardSpaces[][] board)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("First select where you want to move on the board. Give the x coordinate");

        int xNew=input.nextInt();

        System.out.println("Now give the y coordinate");
        int yNew=input.nextInt();
        board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
        board[xNew][yNew]=new Player(xNew,yNew);
    }
    public Boolean overLap(GoblinSpace[] gSpaces, BoardSpaces[][]board)
    {
        if (gSpaces.length==0)
        {
            System.out.println("Ya did it!");
        }
        for (int i=0; i<gSpaces.length; i++)
        {
            if (this.returnX()==gSpaces[i].returnX() && this.returnY()==gSpaces[i].returnY())
            {
                System.out.println("Looks like they caught you. :(");
                return true;
            }
        }
        return false;
    }
}
