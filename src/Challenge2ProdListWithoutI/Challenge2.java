package Challenge2ProdListWithoutI;

public class Challenge2 {

    /* Given an array of integers, return a new array such that each element at index i of the new array is the product
    of all the numbers in the original array except the one at i */


    public static int[] solve(int[] numbers){

        int prod = 1;

        for (int number : numbers){
            prod *= number;
        }
        for (int i = 0; i < numbers.length; ++i){
            numbers[i] = prod/ numbers[i];
        }
        return numbers;
    }

    /* Do the same without dividing*/

    public static int[] solve2(int[] numbers){

        int[] left = new int[numbers.length];
        int[] right = new int[numbers.length];
        left[left.length -1 ] = 1;
        right[0] = 1;
        for (int i = 1; i < numbers.length; ++i){
            right[i] = right[i - 1]*numbers[i-1];
            left[numbers.length - i - 1] = left[numbers.length - i]*numbers[numbers.length - i];
        }

        for (int i = 0; i < numbers.length; ++i){
            numbers[i] = left[i]*right[i];
        }
        return numbers;
    }
}
