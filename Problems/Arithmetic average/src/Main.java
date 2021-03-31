import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num3 = 0;
        double counter = 0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                num3 += a;
                counter++;
            }
        }
        System.out.println(num3 / counter);
    }
}