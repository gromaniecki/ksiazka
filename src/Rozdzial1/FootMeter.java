package Rozdzial1;

public class FootMeter {
    public static void main(String args[]){
        double meter;
        int foot, inch;
        int stoper;
        foot = 0;
        for (stoper=0; stoper != 1;){
            for (inch = 0; inch <= 11; inch ++){

                if (foot == 12) {
                    meter = inch * 0.0254 + 12 * foot * 0.0254;
                    System.out.println(foot + " stóp to "+ meter + " metrów.");
                    stoper = 1;
                    break;
                }

                if (foot == 0) {
                    meter = inch * 0.0254;
                    System.out.println(inch + " cali to " + meter + " metrów");
                }
                if (foot != 0){
                    meter = inch * 0.0254 + 12 * foot * 0.0254;
                    if (inch == 0)
                        System.out.println(foot + " stóp to "+ meter + " metrów.");
                    System.out.println(foot + " stóp i "+ inch +" cali to "+ meter + " metrów.");
                }


            }
            System.out.println();
            foot++;
        }
    }
}
