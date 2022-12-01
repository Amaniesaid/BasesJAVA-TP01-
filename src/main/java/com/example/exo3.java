package com.example;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = sc.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minutes = sc.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int secondes = sc.nextInt();
        System.out.println("il est " +heure+"h"+minutes+"min"+secondes+"s");
        int SecondesAvant  = 24*3600-(heure*3600+minutes*60+secondes);
        System.out.println("Il y a encore"+SecondesAvant+"secondes avant minuit");
        sc.close();
        
}
}
