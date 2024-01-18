import java.util.Scanner;
public class vaja_3_cet_18_1_2024 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podatki pravokotnika: ");
        System.out.print("Stranica a: ");
        double sideA = scanner.nextDouble();

        System.out.println("Stranica b: ");
        double sideB = scanner.nextDouble();

        scanner.close();

        double perimeter = 2 * (sideA + sideB);
        double area = sideA * sideB;

        System.out.println("Obseg pravokotnika je: " + perimeter);
        System.out.println("Ploščina pravokotnika je: " + area);

    }
}
