import java.text.DecimalFormat;
public class naloga3 {

    public static void main(String[] args) {

        float stevilo1 = 50;
        float stevilo2 = 20;

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println(stevilo1 + " + " + stevilo2 + " = " + decimalFormat.format(stevilo1 + stevilo2));
        System.out.println(stevilo1 + " - " + stevilo2 + " = " + decimalFormat.format(stevilo1 - stevilo2));
        System.out.println(stevilo1 + " / " + stevilo2 + " = " + decimalFormat.format(stevilo1 / stevilo2));
        System.out.println(stevilo1 + " * " + stevilo2 + " = " + decimalFormat.format(stevilo1 * stevilo2));
        System.out.println(stevilo1 + " ostanek " + stevilo2 + " = " + decimalFormat.format(stevilo1 % stevilo2));
    }

}
