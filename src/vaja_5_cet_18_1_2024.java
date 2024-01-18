import java.util.Scanner;

public class vaja_5_cet_18_1_2024 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int totalAge = 0;
        int totalWeight = 0;

        for(int i = 1; i<=3; i++){
            System.out.println("Vpiši starost in težo" + i + ". študenta: ");
            int age = scanner.nextInt();
            int weight = scanner.nextInt();

            totalAge += age;
            totalWeight += weight;
        }

        double averageAge = (double) totalAge / 3;
        double averageWeight = (double) totalWeight / 3;

        System.out.println("Povprečna starost: " + String.format("%.4f", averageAge));
        System.out.println("Povprečna teža: " + String.format("%.4f", averageWeight));

    }

}