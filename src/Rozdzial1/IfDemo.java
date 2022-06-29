package Rozdzial1;

public class IfDemo {
    public static void main(String args[]){
        int a,b,c;
        a=2;
        b=3;
        if (a<b) System.out.println("a jest mniejsze od b");
        if (a == b) System.out.println("Ta instrukcja nie zostanie wywołana");
        System.out.println();
        c = a -b;
        System.out.println("C zawiera "+c);
        if (c >= 0) System.out.println("C nie jest ujemne");
        else System.out.println("C jest ujemne");
        c = b-a;
        System.out.println("C zawiera "+c);
        if (c >=0) System.out.println("C jest nieujemne");
        else System.out.println("C jest ujemne");
    }
}
