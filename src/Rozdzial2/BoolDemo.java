package Rozdzial2;

public class BoolDemo {
    public static void main(String args[]){
        boolean b;
        b = false;
        System.out.println("Zmienna boolean wynosi "+b);
        b = true;
        System.out.println("Zmienna boolean wynosi "+b);
        if(b)System.out.println("To zadanie zostanie wykonane");
        b= false;
        if(b)System.out.println("A to nie");
        System.out.println("10 > 9 jest "+(10>9));
    }
}
