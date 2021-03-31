import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterMax = scanner.nextInt();
        int maxElement4 = 0;

        for (int i = 0; i < counterMax; i++) {
            int iteration = scanner.nextInt();
            if (iteration % 4 == 0 && iteration > maxElement4) {
                maxElement4 = iteration;
            }
        }
        System.out.println(maxElement4);
    }
}