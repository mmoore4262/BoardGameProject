//Matthew Moore
import java.util.Scanner;

public class TrapSpace extends BoardSpaces {
    private int x;
    private int y;
    private GoblinSpace[] gSpaces;
    private int trapsCount;
    public TrapSpace(int x, int y)
    {
        super(x,y);
    }
    public String toString()
    {
        return "[T]";
    }
    public int returnX()
    {
        return this.x;
    }
    public int returnY()
    {
        return this.y;
    }
    //Takes user input and changes the position of the trap does this every turn.
    public void changePosition(BoardSpaces[][] board)
    {
        System.out.println("Now pick where you want to set your trap. X and y please.");
        Scanner input= new Scanner(System.in);
        int xNew=input.nextInt();
        System.out.println("Now give the y coordinate");
        int yNew=input.nextInt();
        board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
        board[xNew][yNew]=new TrapSpace(xNew,yNew);

    }
    //WEIRD ERROR. Does not appear to change the space of goblin to generic BS if overlap. In some cases it duplicate  the goblin space.
    public void overLap(GoblinSpace[] gSpaces, BoardSpaces[][]board)
    {
        if (gSpaces.length==0)
        {
            System.out.println("Ya did it!");
        }
        for (int i=0; i<gSpaces.length; i++)
        {
            if (this.returnX()==gSpaces[i].returnX() && this.returnY()==gSpaces[i].returnY())
            {

                gSpaces[i]=null;
                board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
                System.out.println("You got a goblin");
            }
        }
    }
    //Triggered if player and goblin overlap.
    public void FailState(int trapsCount)
    {
        if (trapsCount==0)
        System.out.println("Looks like you ran out of traps. Better luck next time.");
    }
}
