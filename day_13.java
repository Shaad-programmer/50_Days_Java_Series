import java.util.Scanner;

public class day_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Your name is : "+ name);

        // concatenation
        
        String firstName = "Mohd";
        String lastName = "Shaad";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
    }
}
