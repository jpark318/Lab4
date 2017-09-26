
/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Project for Reclamation.
 * Program finds out the section in strings that are same in both inputs.
 */
public class ReclamationProject {

    /**
     * @param unused unused input parameter
     */

    public static void main(final String[] unused) {
       System.out.println(doit("firefired", "fes"));
    }
    /**
     * @param firstString String
     * @param secondString String
     * @return return to r
     */
    static String doit(final String firstString, final String secondString) {
        String result;
        String firstCopy = firstString;
        String secondCopy = secondString;

        if (firstCopy.length() > secondCopy.length()) {
            String temp = firstCopy;
            firstCopy = secondCopy;
            secondCopy = temp;
        }
        if (firstCopy.equals(secondCopy)) {
            result = "";
        } else {
            result = "";
        }
        /*
         * For loop with i
         * Checks out every single substrings possible from
         * firstString and secondString and compares.
         * Then it stores if the string is longer than the
         * string repeated before r where it is result.
         */
        for (int i = 0; i < firstCopy.length(); i++) {
            for (int j = firstCopy.length() - i; j > 0; j--) {
                for (int k = 0; k < secondCopy.length() - j; k++) {
                    if (firstCopy.regionMatches(i, secondCopy, k, j) && j > result.length()) {
                        result = firstCopy.substring(i,  i + j);
                    } else {
                        continue;
                    }
                }
            }
        }
        return result;
    }
}
