import java.util.Scanner;

public class day_11 {
    public static void main(String args[]) {
        // 1st question
        int[] marks = new int [3];
        marks[0]=97;
        marks[1]=95;
        marks[2]=98;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        // using loop...
        for(int i= 0; i<3; i++){
            System.out.println(marks[i]);
        }
        // 2nd question
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input elements
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // print the numbers in array
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
