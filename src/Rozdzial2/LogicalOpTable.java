package Rozdzial2;

public class LogicalOpTable {
    public static int BooleanNaInt(boolean a) {
        if (a == true)
            return 1;
        return 0;
    }
    public static void main (String args[]){

        boolean p,q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true; q=true;
        System.out.print(BooleanNaInt(p)+"\t"+BooleanNaInt(q)+"\t");
        System.out.print(BooleanNaInt(p&q)+"\t"+BooleanNaInt(p|q)+"\t");
        System.out.println(BooleanNaInt(p^q)+"\t"+BooleanNaInt(!p));

        p = true; q=false;
        System.out.print(BooleanNaInt(p)+"\t"+BooleanNaInt(q)+"\t");
        System.out.print(BooleanNaInt(p&q)+"\t"+BooleanNaInt(p|q)+"\t");
        System.out.println(BooleanNaInt(p^q)+"\t"+BooleanNaInt(!p));

        p = false; q=true;
        System.out.print(BooleanNaInt(p)+"\t"+BooleanNaInt(q)+"\t");
        System.out.print(BooleanNaInt(p&q)+"\t"+BooleanNaInt(p|q)+"\t");
        System.out.println(BooleanNaInt(p^q)+"\t"+BooleanNaInt(!p));

        p = false; q=false;
        System.out.print(BooleanNaInt(p)+"\t"+BooleanNaInt(q)+"\t");
        System.out.print(BooleanNaInt(p&q)+"\t"+BooleanNaInt(p|q)+"\t");
        System.out.println(BooleanNaInt(p^q)+"\t"+BooleanNaInt(!p));
    }
}
