public class day_20 {
    // Print a string in reverse.
    // public static String revString(String str) {
    //     if(str.length() == 1) {
    //     return str;
    //     }
    //     char currChar = str.charAt(0);
    //     String nextString = revString(str.substring(1));
    //     return nextString + currChar;
    // }
    //     public static void main(String args[]) {

    //     String str = "A B C D";
    //     String reversed = revString(str);
    //     System.out.println(reversed);
    // }
    
    // Find the occurrence of the first and last occurrence of an element using recursion.
    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str, char el, int idx) {
        if(idx == str.length()) {
        return;
        }
        if(str.charAt(idx) == el) {
        if(first == -1) {
        first = idx;
        } else {
        last = idx;
        }
        }
        getIndices(str, el, idx+1);
    }
        public static void main(String args[]) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
