package Challenge7StringDecoding;

public class Challenge7 {

    /**
     * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

     For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
     */

    /* ************
        Considerations:
     */


    // Dynamic programming approach
    public static int nWaysToDecode(String s){

        int alphaMax = 26;
        int nWaysNextToLast = 1;  // Number of ways to decode ""
        int nWaysLast = 1; // Number of ways to decode "x"
        int n = s.length();
        int nWays = 1;
        if (n < 2){
            return nWays;
        }

        int i = n - 2;
        while (i >= 0){
            nWays = Integer.parseInt(s.substring(i,i+2)) <= alphaMax ? nWaysNextToLast + nWaysLast : nWaysLast;
            nWaysNextToLast = nWaysLast;
            nWaysLast = nWays;
            i--;
        }
        return nWays;
    }



}
