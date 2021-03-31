import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int difference =
                -(scanner.nextInt() * 3600 + scanner.nextInt() * 60 +
                scanner.nextInt() - scanner.nextInt() * 3600 -
                scanner.nextInt() * 60 - scanner.nextInt());
        System.out.println(difference);
    }
}