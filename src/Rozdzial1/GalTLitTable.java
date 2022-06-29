package Rozdzial1;

public class GalTLitTable {
    public static void main(String args[]){
        double litres, gallons;
        int counter = 0;
        for (gallons = 1; gallons <= 100; gallons++){
            litres = gallons * 3.7854;
            System.out.println(gallons+" galonów to "+litres+" litrów.");
            counter++;
            if (counter==10){
                System.out.println("--------------------");
                counter = 0;
            }
        }
    }
}
