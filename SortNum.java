import java.util.Arrays;
import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println("Sorted Numbers in Ascending Order: " + Arrays.toString(num));

    }
}
