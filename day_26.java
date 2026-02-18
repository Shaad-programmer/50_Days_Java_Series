import java.util.ArrayList;
public class day_26 {
       public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }
   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }
       findSubsets(n-1, subset);
       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }
   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   }

// 2nd problem
//    public static void printPermutation(String str, int idx, String perm) {
//        if(str.length() == 0) {
//            System.out.println(perm);
//            return;
//        }      
//        for(int i=0; i<str.length(); i++) {
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0, i) + str.substring(i+1);
//            printPermutation(newStr, idx+1, perm+currChar);
//        }
//    }
//    public static void main(String args[]) {
//        String str = "abc";
//        printPermutation(str, 0, "");
//    }
}
