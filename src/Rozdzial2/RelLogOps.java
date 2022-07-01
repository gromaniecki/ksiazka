package Rozdzial2;

public class RelLogOps {
    public static void main(String args[]){
        int i,j;
        boolean b1,b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("i mniejsze od j");
        if (i <= j) System.out.println("i mniejsze równe j");
        if (i != j) System.out.println("i nie jest równe j");
        if (i == j) System.out.println("i jest równe j");
        if (i >= j) System.out.println("i większe równe j");
        if (i > j) System.out.println("i większe j");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("true");// - AND
        if (!(b1 & b2)) System.out.println("true");// + NOT!
        if (b1 | b2) System.out.println("true");// + OR
        if (b1 ^ b2) System.out.println("true");// + XOR nieparzyste true
        if (b1 || b2) System.out.println("true");// + OR warunkowe sprawdza 1 jeśli true -> true
        if (b1 && b2) System.out.println("true");// - AND warunkowe jeśłi 1 false -> false
    }
}
