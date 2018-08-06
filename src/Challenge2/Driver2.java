package Challenge2;

public class Driver2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] res = Challenge2.solve(numbers);


        for (int number : res) {
            System.out.println(number);
        }

        int[] numbers2 = {1,2,3,4,5};

        int[] res2 = Challenge2.solve2(numbers2);
        for (int number: res2){
            System.out.println(number);
        }


    }
}
