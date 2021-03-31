import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.nextLine()
                  .substring(scanner.nextInt(), scanner.nextInt() + 1));
    }
}