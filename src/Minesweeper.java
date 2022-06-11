
public class Minesweeper {

    public static boolean[][] arrMines = new boolean[][]
            {
                    { true, false, true, false, true, false},
                    { true, false, true, false, true, false},
                    { true, true, false, true, true, false},
                    { true, false, true, false, true, false},
                    { false, false, true, true, true, false}
            };

    public static void main(String[] args)
    {

        int[][] cntMines = new int[arrMines.length][arrMines[0].length];

        for (int row=0; row< arrMines.length; row++)
        {
            for(int col=0; col<arrMines[0].length; col++)
            {
                if (arrMines[row][col]) cntMines[row][col]=9; //има мина
                else cntMines[row][col] = countMinesArround(row,col);

                if (cntMines[row][col]<9) System.out.print(cntMines[row][col]+" ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int countMinesArround(int row, int col)
    {
        int count = 0;
        for(int x=row-1; x<=row+1; x++)
        {
            for(int y=col-1;y<=col+1; y++)
            {
                if (x<0 || x>=arrMines.length || y<0 || y>=arrMines[0].length)
                {

                }
                else
                {
                    if (arrMines[x][y]) count++;
                }
            }
        }
        return count++;
    }
}
