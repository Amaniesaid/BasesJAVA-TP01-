package com.example;
public class exo1 {
    /*
     * @param args
     */
    public static void main(String [] args) {
        int heures = 12;
        int minutes = 34;
        int secondes = 56;
        System.out.println("Il est" + heures + "h" + minutes + "min" + secondes + "s");
        System.out.println();
        int TotSecondes = 12*3600+34*60+56;
        System.out.println("Il s'est écoulé" + TotSecondes + "secondes depuis minuit.");
    }
}
