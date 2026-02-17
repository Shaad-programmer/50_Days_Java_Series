public class day_25 {
//      public static int placeTiles(int n, int m) {
//        if(n < m) {
//            return 1;
//        } else if(n == m) {
//            return 2;
//        }
//        return placeTiles(n-1, m) + placeTiles(n-m, m);
//    }
//    public static void main(String args[]) {
//        int n = 4, m = 4;
//        System.out.println(placeTiles(n, m));
//    }
      public static int pairFriends(int n) {
      if(n <= 1) {
          return 1;
      }


       return pairFriends(n-1) + (n-1) * pairFriends(n-2);
   }


   public static void main(String args[]) {
       int n = 3;
       System.out.println(pairFriends(n));
   }

}
