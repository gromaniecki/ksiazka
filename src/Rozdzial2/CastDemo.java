package Rozdzial2;

public class CastDemo {
    public static void main (String args[]){
        double x,y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y= 3.0;
        i = (int)(x/y);
        System.out.println("Wynik dzielenia jako int to "+i);
        i = 100;
        b = (byte) i;
        System.out.println("Wartosc zmiennnej typu byte b = "+b);
        i = 257;
        b = (byte) i;
        System.out.println("Wartosc zmiennnej typu byte b = "+b);
        b=88;
        ch = (char) b;
        System.out.println("ch:"+ch);
    }
}
