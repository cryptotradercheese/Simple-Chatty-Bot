import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine().trim().replace(" ", "");
        String line2 = scanner.nextLine().trim().replace(" ", "");
        System.out.print(line1.equals(line2));
    }
}