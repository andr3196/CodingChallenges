package Challenge4;

import java.util.Arrays;

public class Challenge4 {

    // Given an array of integers, find the first missing positive integer in linear time and constant space. In other
    // words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and
    // negative numbers as well.
    //
    //For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.


    public static int solve(int[] a){

        Arrays.sort(a); // Not exactly linear time
        for (int i = 0; i < a.length - 1; ++i){
            if (a[i + 1] - a[i] > 1 & a[i] + 1 > 0) {
                return a[i] + 1;
            }
        }

        int res = a[a.length -1] + 1;

        return res < 1 ? 1 : res;
    }
}
