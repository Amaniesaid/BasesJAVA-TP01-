package com.example;
import java.util.Random;
import java.util.Scanner;

public class exo5{
    public static void main(String[] args) {
        Random r = new Random ();
        int nombre = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        int nb = sc.nextInt();
        System.out.println("Vous proposez" +nb);
        System.out.println("Le nombre auquel je pensais était" +nombre);
        if(nombre > nb){
            int a = nombre-nb;
            System.out.println("Vous étiez à " +a);
        } else{
            int a = nb-nombre;
            System.out.println("Vous étiez à " +a);
        }

        sc.close();

    }
}