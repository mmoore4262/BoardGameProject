public class GoblinSpace extends BoardSpaces {
    private int x;
    private int y;
    //Goblins are initially to be randomly spawned in the first three rows. gPosX and gPosY
    private int gPosX;
    private int gPosY;
    private Player p;
    public GoblinSpace(int x, int y, int gSpace)
    {
        super (x,y);
        this.gPosX=gPosX;
        this.gPosY=gPosY;
    }
}
