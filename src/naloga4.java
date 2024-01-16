public class naloga4 {

    public static void main(String[] args) {

    int stevilo = 123;

    while (stevilo > 0){
        int zadnjaStevilka = stevilo % 10;
        System.out.println(zadnjaStevilka);
        stevilo /= 10;
        }
    }

}