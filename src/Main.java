//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] testArr = {5, 9, Integer.MAX_VALUE, 4, -100, Integer.MAX_VALUE, 68, 88, 2};
        int[] sortedArr = sentinelSort(testArr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }


    }

    public static int[] sentinelSort(int[] arr) {
        int n = arr.length;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            int minElementIndex = findMinElementIndex(arr);
            B[i] = arr[minElementIndex];
            arr[minElementIndex] = Integer.MAX_VALUE;
        }

        return B;

    }

    public static int findMinElementIndex(int[] arr) {
        int minElementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minElementIndex]) {
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }
}