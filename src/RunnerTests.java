import java.util.Scanner;

public class RunnerTests {

        private static boolean gameOn = true;

        public static void main(String[] args)
        {
            String test="[X]";

            //System.out.println((int)Math.floor(Math.random() * (14 - 0)) + 0);

            Player avatar= new Player(6, 7);
            GoblinSpace[] gSpaces= new GoblinSpace[3];
            for (int i=0; i<gSpaces.length; i++)
            {
                gSpaces[i]=new GoblinSpace((int)Math.floor(Math.random() * (14)) , i, true);
                System.out.println( "x " +gSpaces[i].returnX());
                System.out.println("y "+gSpaces[i].returnY());
            }



            //initialize board to hold any number of BoardSpaces
            BoardSpaces[][] board = new BoardSpaces[15][10];
            int iG=0;
            //fill the board indexes with normal BoardSpaces
            for (int x=0; x<board.length; x++)
            {
                for (int y=0; y<board[x].length; y++)
                {
                    board[x][y]=new BoardSpaces(x,y);

                }
                    //board now holds [x] sets of [y] sets of BoardSpaces

            }
            board[avatar.returnX()][avatar.returnY()]=avatar;
            for (int i=0; i<gSpaces.length;i++)
            {
                board[gSpaces[i].returnX()][gSpaces[i].returnY()]=gSpaces[i];
            }



            System.out.println("You've been commissioned to hunt some goblins in a dark garden. This is the layout of the garden presently: \n \n ");
            avatar.boardOut(board);

            System.out.println("If you understand, press y then enter");
            Scanner input= new Scanner(System.in);
            String ans=input.nextLine();

            Boolean u=false;
            while (u==false)
            {
                if (ans.equals("y")) {
                    System.out.println("The spaces marked with X are 'Dark' spaces. The space marked with P is you.\n In 3 of these spaces on the board there are goblins.\n" +
                            " In order to figure out which spaces have Goblins in them, you must light them up\n\n" +
                            "You have three Light Sources.\n Flash [F], Searchlight[S], and CandleLight[C].\n All LightSources can change at least one adjacent 'Dark' Space into a 'Light' space [L} \n " +
                            "A 'Light' space [L], that contains a Goblin space has a [G] in it. \n\n Every turn you will type in what Light Source you want to place, and where in the garden you wish to place it in x,y format. \n" +
                            "Every turn the goblins will move one space. If a goblin catches you, you die. \n Catch a Goblin by setting a trap. A trap takes two turns to go off once set, and covers" +
                            "a 3x3 area, catching goblins in that area.");

                    System.out.println("Type y if you understand.");
                    ans=input.nextLine();
                    u = true;
                }
                else
                {
                    System.out.println("y please");
                    ans = input.nextLine();
                }
            }

            while(true)
            {
                avatar.boardOut(board);
                avatar.changePosition(board);
                for (int i=0; i<gSpaces.length;i++)
                {
                    gSpaces[i].moveXY(board);
                }
                avatar.boardOut(board);
            }


















        }
    }


