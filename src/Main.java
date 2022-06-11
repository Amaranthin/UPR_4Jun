import java.util.Scanner;

//   Да се генерира двумерен масив с N реда и N колони, който съдържа
//   последователни числа подредени в спирала като на охлюв.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix ... ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num=1;
        int count = n;
        int a=0;
        int b=-1;
        while (count>0) {
            for (int i = 0; i < count; i++) {
                b++;
                arr[a][b] = num;
                num++;
            }
            count--;
            for (int i = 0; i < count; i++) {
                a++;
                arr[a][b] = num;
                num++;
            }
            for (int i = 0; i < count; i++) {
                b--;
                arr[a][b] = num;
                num++;
            }
            count--;
            for (int i = 0; i < count; i++) {
                a--;
                arr[a][b] = num;
                num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}