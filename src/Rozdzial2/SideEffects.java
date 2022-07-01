package Rozdzial2;

public class SideEffects {
    public static void main (String args[]){
        int i =0;
        if (false & (++i < 20000))
            System.out.println("Brak wywolania");
        System.out.println("Liczba wywołań IF = "+ i);
        if (false && (++i < 20000))
            System.out.println("Brak wywolania");
        System.out.println("Liczba wywołań IF = "+ i);

    }
}
