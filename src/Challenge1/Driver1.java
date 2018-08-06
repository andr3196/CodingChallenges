package Challenge1;

import com.sun.tools.javac.util.Pair;

import java.util.List;

public class Driver1 {

    public static void main(String[] args) {
        int[] numbers = {10, 15, 13, 3, 7};

        List<Pair> result1 =  Challenge1.solve(numbers, 17);
        System.out.println(result1);


        int[] numbers2 = {1,2,3,4,5,6,7,8,9};

        List<Pair> result2 =  Challenge1.solve(numbers2, 10);
        System.out.println(result2);

    }
}
