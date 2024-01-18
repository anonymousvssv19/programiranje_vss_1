import java.util.Scanner;
public class vaja_2_cet_18_1_2024 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vpiši dve celi števili");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Prvo šteivlo je: " + num1);
        System.out.println("Drugo število je: " + num2);

        int sum = num1 + num2;
        System.out.println("Vsota števil je " + sum);

        scanner.close();

    }

}
