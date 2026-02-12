public class lps {

    public static int[] buildLPS(String pattern) {

        int n = pattern.length();
        int[] lps = new int[n];

        int len = 0;   // length of previous longest prefix suffix
        int i = 1;     // start from index 1

        while (i < n) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {

                if (len != 0) {
                    len = lps[len - 1];  
                } 
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {

        String pattern = "ababaca";
        int[] lps = buildLPS(pattern);

        for (int val : lps) {
            System.out.print(val + " ");
        }
    }
}
