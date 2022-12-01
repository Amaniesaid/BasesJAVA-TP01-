package com.example;
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = sc.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minutes = sc.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int secondes = sc.nextInt();
        System.out.println("il est " +heure+"h"+minutes+"min"+secondes+"s");
        int SecondePassées = heure*3600+minutes*60+secondes;
        int SecJour= 3600*24;
        double pourcentage = ((double)SecondePassées/SecJour)*100;
        System.out.println("Vous avez passer ce pourcentage de la journée dans cet exercice" +pourcentage);
        sc.close();
    }
}