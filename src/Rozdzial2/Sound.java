package Rozdzial2;

public class Sound {
    public static void main(String args[]){
        double distance, speed, time, echo;
        time = 7.9;
        speed = 330;
        distance = time * speed;
        System.out.println("Piorun uderzyl "+distance+" metrów stąd.");
        echo = distance / 2;
        System.out.println("Ściana znajduje się "+echo+" metrów stąd.");

    }
}
