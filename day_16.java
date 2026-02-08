// 1st problem
public class day_16 {
    public static void printSum(int n, int sum) {
    if(n == 0) {
    System.out.println(sum);
    return;
    }
    sum += n;
    printSum(n-1, sum);
    }
    public static void main(String args[]) {
    printSum(5, 0);
    }
    
// 2nd problem
    public static void printFactorial(int n, int fact) {
        if(n == 0) {
        System.out.println(fact);
        return;
        }
        fact *= n;
        printFactorial(n-1, fact);
        }
        public static void main(String args[]) {
        printFactorial(5, 1);
    }
}
