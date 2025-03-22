package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = new String[4];
        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String str = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = str;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int size = 0;
        for (int i : arr) {
            if (i > 0) {
                size++;
            }
        }
        int[] newArr = new int[size];
        int pos = 0;
        for (int j : arr) {
            if (j > 0) {
                newArr[pos++] = j;
            }
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        int maxRow = arr.length;
        int maxColumn = 0, index = 0, temp;

        for (int[] value : arr) {
            maxColumn = Math.max(maxColumn, value.length);
        }

        int[][] sortedRaggedArray = new int[maxRow][maxColumn];

        for (int i = 1; i <= maxColumn; i++) {
            for (int[] ints : arr) {
                if (ints.length == i) {
                    for (int k = 0; k < ints.length; k++) {
                        if ((k + 1) < ints.length && ints[k] > ints[k + 1]) {
                            temp = ints[k];
                            ints[k] = ints[k + 1];
                            ints[k + 1] = temp;
                        }
                    }
                    sortedRaggedArray[index++] = ints;
                }
            }
        }

        return sortedRaggedArray;
    }

}
