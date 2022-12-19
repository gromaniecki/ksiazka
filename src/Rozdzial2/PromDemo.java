package Rozdzial2;

public class PromDemo {
    public static void main (String args []){
        byte b;
        int i;
        char ch1 ='a';
        char ch2='b';
        ch1 = (char) (ch1 +ch2);

        b =10;
        i= b*b;
        b=10;
        b = (byte) (b*b);
        System.out.println("i oraz b => "+i+" "+ b);
        System.out.println(ch1);
    }
}
