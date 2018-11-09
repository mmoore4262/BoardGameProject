//Matthew Moore
public interface BoardBehavior
{
    public void changeType();
    public void litOrNot();
    public int returnX();
    public int returnY();
    public void overLap(Player avatar, BoardSpaces[][]board);

}
