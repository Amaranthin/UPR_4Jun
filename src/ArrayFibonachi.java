import java.util.Scanner;

public class ArrayFibonachi {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input n (int):");
        int n = scn.nextInt();

        int[] finArray = new int[n];


        if (n<2) {System.out.println("Invalid data"); System.exit(1);}
        finArray = createFibonachiArray(n);
    }

    public static int[] createFibonachiArray(int n)
    {
        int[] array = new int[n];
        array[0]=0; array[1]=1;

        for (int i=0; i<n; i++)
        {
            if (i>1) array[i] = array[i-2]+array[i-1]; //установява стойностите на новите елементи
            System.out.printf("array[%d]=%d \n",i, array[i]);
        }
        return array;
    }
}
