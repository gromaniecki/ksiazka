package Rozdzial2;

public class ScopeDemo {
    public static void main (String args[]){
        int x = 10;
        if (x==10){
            int y = 20;
            System.out.println(x +" "+ y);
            x = y*2;
        }
        //y = 100; //To nie jest widoczne ponieważ y nie jest zadeklarowana
        System.out.println(x);
    }
}
