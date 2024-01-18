import java.util.Scanner;
public class vaja_4_cet_18_1_2024 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vpiši dve celi števili");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Začetna vrednost spremenljivke x je: " + x + ".");
        System.out.println("Začetna vrednsot spremenljivke y je: " + y + ".");

        int temp = x;
        x = y;
        y = temp;

        System.out.println("\nZamenjava vrednosti spremenljivk x <= => y.");
        System.out.println("Nova vrednost spremenljivke x je " + x + ".");
        System.out.println("Nova vrednost spremenljivke y je " + y + ".");

        scanner.close();
    }

}