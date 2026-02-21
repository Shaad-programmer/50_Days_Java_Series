// 1st problem
class day_29 {
//     String name;
//     int age;
//     public void getInfo() {
//         System.out.println("The name of this Student is " + this.name);
//         System.out.println("The age of this Student is " + this.age);
//     }
// }
// public class OOPS {
//     public static void main(String args[]) {
//         day_29 s1 = new day_29();
//         s1.name = "Shaad";
//         s1.age = 24;
//         s1.getInfo();

//         day_29 s2 = new day_29();
//         s2.name = "Saad";
//         s2.age = 22;
//         s2.getInfo();
//     }

// 2nd problem
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}
public class OOPS {
    public static void main(String args[]) {
        day_29 p1 = new day_29();
        p1.color = "blue";

        day_29 p2 = new day_29();
        p2.color = "black";

        day_29 p3 = new day_29();
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
