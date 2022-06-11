public class Snail {
    public static int curX, curY, direction=90;

    public static void main(String[] args)
    {
        int n = 9;
        int[][] snail = new int[n][n];

        curX = n/2;
        curY = curX;
        int num=1;
        snail[curX][curY]=1;

        while (num<n*n)
        {
            num++;
            while (!findNextEmptyAndFill(curX, curY, direction, snail))
            {
                direction = direction-90; //за да запази посоката,ще прекъсне опита за завиване по часовника
            }
            snail[curX][curY]=num;
        }

        for (int x=0; x<n; x++)
        {
            for(int y=0; y<n; y++)
            {
                if(snail[x][y]<10) System.out.print("0");
                System.out.print(snail[x][y]+" ");
            }
            System.out.println();
        }
    }

    public static boolean findNextEmptyAndFill(int x, int y, int dir, int arr[][])
    {
        dir = dir+90 ; //въртим като градуси по часовниковата стрелка
        double radians = Math.toRadians(dir);
        int newX = curX + (int) Math.sin(radians);
        int newY = curY + (int) Math.cos(radians);

        //ако новото местоположение е празно нека да се разположи там и да завие
        if (arr[newX][newY] == 0)
        {
            curX = curX + (int) Math.sin(radians);
            curY = curY + (int) Math.cos(radians);
            direction = dir;
            return true; //клетката е била празна
        }
        return false;  //ако не е празно ще се опита да продължи в последната посока
    }
}
