package Rozdzial2;

public class VarInitDemo {
    public static void main (String args[]){
        int x;
        for (x=0; x<3;x++){
            int y = -1;
            System.out.println("Y wynosi "+y);
            y = y * -100;
            System.out.println("A teraz "+y);
        }
    }
}
