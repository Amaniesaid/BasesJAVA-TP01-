package com.example;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = sc.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minutes = sc.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int secondes = sc.nextInt();
        System.out.println("il est " +heure+"h"+minutes+"min"+secondes+"s");
        int TotSecondes = heure*3600+minutes*60+secondes;
        System.out.println("Il s'est écoulé"+TotSecondes+"secondes depuis minuit");
        sc.close(); //Fermer le clavier
    } 
        
    
}