import java.util.*;

public class StudentPassChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if(marks >= 35) {
            System.out.println(name + " has PASSED.");
        } else {
            System.out.println(name + " has FAILED.");
        }
        sc.close();
    }
}
