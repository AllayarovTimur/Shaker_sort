import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayString = scanner.nextLine();

        String[] arrayStringSplit = arrayString.split(" ");

        int[] array = new int[arrayStringSplit.length];
        for(int i = 0; i<arrayStringSplit.length; i++ )
        {
            array[i]=Integer.parseInt(arrayStringSplit[i]);
        }

        for(int i = array.length-1; i>0; i--)
        {
            for(int j = array.length-1-i; j<i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int c = array[j];
                    array[j] = array[j+1];
                    array[j+1] = c;
                }
            }

            for(int j = i-1; j>0;j--)
            {
                if(array[j]<array[j-1])
                {
                    int c = array[j];
                    array[j] = array[j-1];
                    array[j-1] = c;
                }
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
