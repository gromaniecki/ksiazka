package Rozdzial2;

public class ModuloDemo {
    public static void main (String args[]){
        int iresult, imod;
        double dresult, dmod;
        iresult = 10/3;
        imod = 10%3;

        dresult = 10.0/3.0;
        dmod = 10.0%3.0;

        System.out.println("Integer dzielenie ="+iresult+"\nInteger modulo ="+imod);
        System.out.println("Double dzielenie ="+dresult+"\nDouble modulo ="+dmod);
    }
}
