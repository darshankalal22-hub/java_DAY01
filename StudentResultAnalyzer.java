import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of 3 subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double average = total / 3.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (a >= 35 && b >= 35 && c >= 35)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        if (a >= 35 && b >= 35 && c >= 35 && average >= 75)
            System.out.println("Distinction");

        if (a >= 35 && b >= 35 && c >= 35 && average >= 90)
            System.out.println("Special Award");

        sc.close();
    }
}