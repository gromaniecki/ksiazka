package Rozdzial2;
import java.util.Scanner;

public class SystemEkspercki {

    public static void main(String [] args){

        System.out.println("Witamy w systemie ekperckim pomagającym wybrać odpowiedni rodzaj maseczki do twojej twarzy");
        System.out.println("Grzegorz Romaniecki - AHE 2002 \n \n");
        String TakLubNie = "\nproszę o odpowiedź tak lub nie\n";

        System.out.println("Czy masz skórę suchą?"+TakLubNie);
        String Przetluszczona = ("Czy masz skórę przetłuszczoną?"+TakLubNie);
        boolean odpowiedz1 = TakNie();
        if (odpowiedz1)
                System.out.println("dupa");
        else
            System.out.println("biskupa");



    }

    private static boolean TakNie() {
        for(;;) {
            String error ="proszę napisać tak lub nie";
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();


            if (text.equals("tak")) {
                return true;
                }
            else if (text.equals("nie")){
                return false;
                }
            else System.out.println(error);

        }
    }


}


