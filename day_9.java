import java.util.Scanner;

public class day_9 {
    public static void printFactorial(int n) {
        // loop
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
    
    // public static int calculateProduct(int a, int b){
    //     return a * b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println("product of 2 numbers is : "+ calculateProduct(a, b));
    // }

//     public static int calculateSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();

//         int sum= calculateSum(a,b);
//         System.out.println("Sum of a & b is : "+ sum);
//     }
}
