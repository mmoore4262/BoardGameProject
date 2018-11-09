//Matthew Moore
public class GoblinSpace extends BoardSpaces {
    private int x;
    private int y;
    //Goblins are initially to be randomly spawned in the first three rows. gPosX and gPosY
    private int gPosX;
    private int gPosY;
    private boolean lit;
    private boolean isIt;
    private Player p;

    public GoblinSpace(int x, int y, boolean lit)
    {
        super (x,y);
        this.gPosX=x;
        this.gPosY=y;
        this.lit=lit;
    }
    //Returns gPosX field, or it's position in board.
    public int returnX()
    {
        return this.gPosX;
    }
    //Ditto returnX()
    public int returnY()
    {
        return this.gPosY;
    }
    //Never used lit functionality, ran out of time
    public String toString()
    {
        if (this.lit==true)
        {
            return "[G]";
        }
        else
        {
            return"[X]";
        }
    }
    /**public void notLit()
    {
        this.lit=false;
    }**/
    //Changes position of Goblin every turn. To avoid out of bounds error, It will automatically move back or move forward one.
    public String moveXY(BoardSpaces [][] board)
    {
        int xOrY=(int)(Math.random() * (2-1+1)+1);
        if (this.returnX()==0)
        {
            board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
            board[this.returnX()+1][this.returnY()]=new GoblinSpace(this.returnX()+1,this.returnY(),true);

            return null;
        }
        if (this.returnY()==0)
        {
            board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
            board[this.returnX()][this.returnY()+1]=new GoblinSpace(this.returnX(),this.returnY()+1,true);

            return null;
        }
        if (this.returnX()==14)
        {
            board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
            board[this.returnX()-1][this.returnY()]=new GoblinSpace(this.returnX()-1, this.returnY(),true);

            return null;
        }
        if (this.returnY()==9)
        {
            board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
            board[this.returnX()][this.returnY()-1]=new GoblinSpace(this.returnX(),this.returnY()-1,true);

            return null;
        }
        else
        {
            if (xOrY==1)
            {
                board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
                board[this.returnX()+(int)(Math.random() * (1-(-1)+1)+(-1))][this.returnY()]=new GoblinSpace(this.returnX()+(int)(Math.random() * (1-(-1)+1)+1),this.returnY(),true);

                return null;
            }
            else
            {
                board[this.returnX()][this.returnY()]=new BoardSpaces(this.returnX(),this.returnY());
                board[this.returnX()][this.returnY()+(int)(Math.random() * (1-(-1)+1)+(-1))]=new GoblinSpace(this.returnX(),this.returnY()+(int)(Math.random() * (1-(-1)+1)+1),true);

                return null;
            }
        }

    }
}
