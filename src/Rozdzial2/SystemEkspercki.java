package Rozdzial2;
import java.util.Scanner;

public class SystemEkspercki {

    public static void main(String [] args){

        System.out.println("Witamy w systemie ekperckim pomagającym wybrać odpowiedni rodzaj maseczki do twojej twarzy");
        System.out.println("Grzegorz Romaniecki - AHE 2002 \n \n");
        String TakLubNie = "\nproszę o odpowiedź tak lub nie\n";

        System.out.println("Czy masz skórę suchą?"+TakLubNie);
        String Przetluszczona = ("Czy masz skórę przetłuszczoną?"+TakLubNie);
        TakNie();



    }

    private static void TakNie() {
        for(;;) {
            String error ="proszę napisać tak lub nie";
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            //System.out.println(text.equals(tak));

            if (text.equals("tak")){
                System.out.println("udało się");
                break;}
            if (text.equals("nie")){
                System.out.println("nie udało się");
                Tlusta();
                break;}
            System.out.println(error);
        }
    }

    private static void Tlusta() {
        for(;;) {

            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            //System.out.println(text.equals(tak));

            if (text.equals("tak")){
                System.out.println("udało się");
                break;}
            if (text.equals("nie")){
                System.out.println("nie udało się");
                Tlusta();
                break;}
            System.out.println("error");
        }
    }
}


