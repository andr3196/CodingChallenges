package Challenge1;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    // Description: Given a list of n numbers find return all pairs that add to k

    public static List<Pair> solve(int[] numbers, Integer k){
        Arrays.sort(numbers);
        List<Pair> result = new ArrayList<>();
        int  i = 0;
        int  j = numbers.length - 1;
        while (i < j) {
            int r = numbers[i] + numbers[j];
            if (r < k){
                i++;
            }else if (r > k){
                j--;
            }else{
                result.add(new Pair<>(i,j));
                i++;
            }

        }
        return result;
    }

}
