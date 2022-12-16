package Rozdzial2;
import java.util.Scanner;

import static java.lang.System.*;

public class SystemEkspercki {

    public static void main(String [] args){

        out.println("Witamy w systemie ekperckim pomagającym wybrać odpowiedni rodzaj maseczki do twojej twarzy");
        out.println("Grzegorz Romaniecki - AHE 2002 \n \n");
        String TakLubNie = "\nproszę o odpowiedź tak lub nie\n";

        out.println("Czy masz cienka skore?"+TakLubNie);
        boolean response = TakNie();
        if (response) {
            naczynka();
        } else {
            matowa();
        }
    }

    private static void matowa() {
        out.println("Czy masz skore matowa? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            skoraGladka();
        } else {
            naturalneSwiecenie();
        }
    }

    private static void skoraGladka() {
        out.println("Czy masz gladka skore? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            ceraNormalna();
        } else {
            zmarszczki();
        }
    }

    private static void zmarszczki() {
        out.println("Czy masz widoczne zmarszczki? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            ceraDojrzala();
        } else {
            ceraNormalna();
        }
    }

    private static void ceraDojrzala() {
        out.println("Masz cere dojrzala");
    }

    private static void ceraNormalna() {
        out.println("Masz cere normalna");
    }

    private static void naturalneSwiecenie() {
        out.println("Czy twoja skora naturalnie swieci? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            ceraNaczyniowa();
        } else {
            zaskorniki();
        }
    }

    private static void ceraNaczyniowa() {
        out.println("Masz cere naczyniowa");
    }

    private static void naczynka() {
        out.println("Czy masz widoczne naczynka? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            zaskorniki();
        } else {
            ceraSucha();
        }
    }

    private static void ceraSucha() {
        out.println("Masz cere sucha");
    }

    private static void zaskorniki() {
        out.println("Czy masz zaskorniki? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            ceraTlusta();
        } else {
            zaczerwienienia();
        }
    }

    private static void ceraTlusta() {
        out.println("Masz cere tlusta");
    }

    private static void zaczerwienienia() {
        out.println("Czy masz widoczne zaczerwnienienia? \nproszę o odpowiedź tak lub nie\n");
        boolean response = TakNie();
        if (response) {
            ceraWrazliwa();
        } else {
            ceraMieszana();
        }
    }

    private static void ceraMieszana() {
        out.println("Masz cere mieszana");
    }

    private static void ceraWrazliwa() {
        out.println("Masz cere wrazliwa");
    }



    private static boolean TakNie() {
        for(;;) {
            String error ="proszę napisać tak lub nie";
            Scanner scan = new Scanner(in);
            String text = scan.nextLine();


            if (text.equals("tak")) {
                return true;
                }
            else if (text.equals("nie")){
                return false;
                }
            else out.println(error);

        }
    }


}


