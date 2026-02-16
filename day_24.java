// import java.util.HashSet;
// Print all unique subsequences of a string.
public class day_24 {
    // public static void printSubseq(String str, int idx, String res, HashSet<String>allSubseq) {
    //     if(idx == str.length()) {
    //     if(allSubseq.contains(res)) {
    //     return;
    //     }
    //     allSubseq.add(res);
    //     System.out.println(res);
    //     return;
    //     }
    //     //choose
    //     printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
    //     //don't choose
    //     printSubseq(str, idx+1, res, allSubseq);
    // }
    //     public static void main(String args[]) {
    //     String str1 = "abc";
    //     String str2 = "aaa";
    //     HashSet<String> allSubseq = new HashSet<>();
    //     printSubseq(str2, 0, "", allSubseq);
    // }

    // Print keypad combination
    // ( 0 -> .;
    // 1 -> abc
    // 2 -> def
    // 3 -> ghi
    // 4 -> jkl
    // 5 -> mno
    // 6 -> pqrs
    // 7 -> tu
    // 8 -> vwx
    // 9 -> yz
    // )
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
        public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
        System.out.println(res);
        return;
        }
        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
        char curr = keypad[number.charAt(idx)-'0'].charAt(i);
        printKeypadCombination(number, idx+1, res+curr);
        }
    }
        public static void main(String args[]) {
        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}
