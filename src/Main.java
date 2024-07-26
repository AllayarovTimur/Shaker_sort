import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayString = scanner.nextLine();

        String[] arrayStringSplit = arrayString.split(" ");

        int[] array = new int[arrayStringSplit.length];
        for (int i = 0; i < arrayStringSplit.length; i++)
        {
            array[i] = Integer.parseInt(arrayStringSplit[i]);
        }

        int c = 0;
        int step = array.length - 1;
        while (step>=1)
        {

            for (int j = 0; j < array.length - step; j++)
            {
                if(array[j]>array[j + step])
                {
                    c = array[j];
                    array[j] = array[j + step];
                    array[j + step] = c;
                }
            }
            step = (int) Math.floor(step / 1.247);
        }

        for (int j : array)
        {
            System.out.print(j + " ");
        }

    }
}
