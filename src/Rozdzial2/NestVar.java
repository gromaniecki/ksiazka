package Rozdzial2;

public class NestVar {
    public static void main (String args[]){
        int count;
        for (count=0;count<10;count++){
            System.out.println("Wartość zmiennej count wynosi "+count);
            int count2;
            for(count2=0;count2 <2;count2++){
                System.out.println("Ten program zawiera błąd");
            }
        }
    }
}
