package Challenge4FirstPositiveMissingInt;

public class Driver4 {

    public static void main(String[] args) {

        int[] a = {3, 4, -1, 1};

        int missing_int = Challenge4.solve(a);
        System.out.println(missing_int);

        int[] b = {-1, -3, -2, -4};

        missing_int = Challenge4.solve(b);
        System.out.println(missing_int);

        int[] c = {-1, -15, -45, -56, -10, 1, 2, 3};

        missing_int = Challenge4.solve(c);
        System.out.println(missing_int);

        int[] d = {-10};

        missing_int = Challenge4.solve(d);
        System.out.println(missing_int);

        int[] e = {1,1,1,1,1};

        missing_int = Challenge4.solve(e);
        System.out.println(missing_int);


    }
}
