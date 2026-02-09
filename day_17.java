public class day_17 {
    // Print the fibonacci sequence till nth term.

    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        System.out.println(a);
        printFactorial(b, a+b, n-1);
        }
        public static void main(String args[]) {
        printFactorial(0, 1, 5);
    }

    // Print x^n (with stack height = n)
    // public static int printPower(int x, int n) {
    //     if(n == 0) {
    //     return 1;
    //     }
    //     if(x == 0) {
    //     return 0;
    //     }
    //     int x_ = printPower(x, n-1);
    //     int xn = x * x_;
    //     return xn;
    //     }
    //     public static void main(String args[]) {
    //     int x = 2, n = 5;
    //     int output = printPower(x, n);
    //     System.out.println(output);
    // }
}
