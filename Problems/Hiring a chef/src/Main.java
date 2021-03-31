import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisine = scanner.next();
        System.out.print("The form for ");
        System.out.print(name);
        System.out.print(" is completed. We will contact you if we need a");
        System.out.print(" chef that cooks ");
        System.out.print(cuisine);
        System.out.print(" dishes.");
    }
}