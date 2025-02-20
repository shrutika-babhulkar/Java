import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int length1 = array1.length;
        int length2 = array2.length;

        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
