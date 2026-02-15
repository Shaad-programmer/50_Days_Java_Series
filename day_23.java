public class day_23 {
    // Print all the permutations of a string.
    public static void printPermutation(String str, int idx, String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr, idx+1, perm+currChar);
       }
   }
   public static void main(String args[]) {
       String str = "ABC";
       printPermutation(str, 0, "");
   }

    // Count Path Maze 
   public static int countPaths(int i, int j, int m, int n) {
       if(i == m-1 || j == n-1) {
           return 1;
       }
       return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
   }
   public static void main(String args[]) {
       int m = 4, n = 5;
       System.out.println(countPaths(0, 0, m, n));
   }
}
