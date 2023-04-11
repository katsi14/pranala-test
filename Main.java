
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Technical Code");
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Angka:");
        String input = scanner.nextLine();
        System.out.println("1. Generate Segitiga | 2. Generate Bilangan Ganjil | 3. Generate Bilangan Prima");
        System.out.print("Pilih Menu:");
        int menu = scanner.nextInt();
        // shorcut to debug
        runMenu(menu, input);
        // createTriangle("1345000");
    }

    static void runMenu(int menu, String inp) {
        switch (menu) {
            case 1:
                createTriangle(inp);
                break;
            case 2:
                generateGanGen(inp);
                break;
            case 3:
                generatePrime(inp);
                break;

        }
    }

    private static void generatePrime(String inp) {
        System.out.println("Generate Prime");
        System.out.println("====================");

        int input = Integer.parseInt(inp);
        System.out.print("Bilangan Prima:");
        for (int i = 0; i < input; i++) {
            if (i == 2) {
                System.out.print(" " + i);
            }
            if (i % 2 == 1) {
                if (checkPrime(i)) {

                    System.out.print(" " + i);
                }
            }
        }
    }

    static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void generateGanGen(String inp) {
        System.out.println("Generate Ganji; Genap");
        System.out.println("====================");
        // convert to int
        int input = Integer.parseInt(inp);
        System.out.print("Angka Ganjil:");
        for (int i = 0; i < input; i++) {
            if ((i % 2) > 0) {
                System.out.print(" " + i);
            }

        }
    }

    public static void createTriangle(String number) {
        System.out.println("Generate Segitiga");
        System.out.println("====================");
        for (int i = 0; i <= number.length() - 1; i++) {
            // System.out.print("0");
            for (int j = 0; j <= i; j++) {
                if (i <= 4 && j < 1) {
                    System.out.print(number.charAt(i) + "0");
                } else {
                    System.out.print("0");
                }
                // System.out.print(i);
            }
            // while (j <= i) {
            // System.out.print(i);
            // j = j + 2;
            // }
            System.out.println("");
        }
    }
}