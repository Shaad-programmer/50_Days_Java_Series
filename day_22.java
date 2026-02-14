public class day_22 {
    // Remove duplicates in a string.
    // public static String removeDuplicates(String str, int idx, boolean present[]) {
    //     if(idx == str.length()) {
    //     return "";
    //     }
    //     char curr = str.charAt(idx);
    //     if(present[curr-'a']) {
    //     return removeDuplicates(str, idx+1, present);
    //     } else {
    //     present[curr-'a'] = true;
    //     return curr + removeDuplicates(str, idx+1, present);
    //     }
    // }
    //     public static void main(String args[]) {
    //     String str = "abcadbcefghabi";
    //     boolean present[] = new boolean[str.length()];
    //     System.out.println(removeDuplicates(str, 0, present));
    // }

    // Print all the subsequences of a string.
    public static void printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
        System.out.println(res);
        return;
        }
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx));
        //don't choose
        printSubseq(str, idx+1, res);
    }
        public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str1, 0, "");
    }
}
