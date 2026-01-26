import java.util.Scanner;

public class day_4 {
    public static void main(String[] args) {
        // 1st case
        int x=4;
        int add=0;
        for(int i=1; i<=x; i++)
        {
            add=add+i;
        }
        System.out.println(add);
        
        // 2nd case
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=0; i<=n; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

        // 3rd case
        // Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        for(int i=1; i<11; i++){
            System.out.println(i*a);
        }
    }
}
