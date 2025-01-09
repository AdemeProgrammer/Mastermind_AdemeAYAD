import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
         System.out.println("Bienvenue dans le jeu du MasterMind !");
         System.out.println("Le MasterMind est un jeu de logique classique où le joueur tente de deviner une séquence \n" +
                 "secrète de chiffres. Dans ce projet, l'objectif est de créer une version numérique du jeu en \n" +
                 "utilisant le langage de programmation Java.");
         System.out.println("Les règles sont simples : ");
         System.out.println("1- La séquence secrète est composée de 5 chiffres de 1 à 9, sans répétition.");
         System.out.println("2- Le joueur soumet des propositions de séquences, et les indices sont donnés en fonction des chiffres corrects et bien placés, ainsi que des chiffres corrects mais mal placés.");
         System.out.println("3- Le joueur a un nombre limité de tentatives pour deviner la séquence secrète. (12 tentatives) ");
         System.out.println("4- La partie se termine lorsque le joueur trouve la séquence secrète ou épuise toutes ses tentatives. ");
         System.out.println("Voulez vous commencer la partie ? (o/n)");
         String commencerPartie = clavier.nextLine().toUpperCase();
         if (commencerPartie.equals("o")) {
             boolean victoire = false;
             int nbTentatives = 12;
             String ListeNombre = genererListeNombre();
             while (nbTentatives > 0 || !victoire) {
                 System.out.println("Nombres de tentatives restantes : "+nbTentatives+"(ça se rapproche de la défaite)");
                 System.out.println("Entrer une suite de nombre (5 nombres entre 1 et 9) :");
                 String tentativeListeNombre = clavier.nextLine().toUpperCase();
                 if (!tentativeListeNombre.matches("[1-9]{5}")) {
                     System.out.println("Erreur : la proposition doit être composée de 5 chiffres distincts entre 1 et 9.");
                     continue;
                 }
                 int bienPlace = 0;
                 int malPlace = 0;
                 for (int i = 0; i< 5; i++) {
                     if(tentativeListeNombre.charAt(i) == ListeNombre.charAt(i)) {
                         bienPlace ++;
                     } else if (ListeNombre.contains(String.valueOf(ListeNombre.charAt(i)))) {
                         malPlace ++;
                     }
                 }
                 System.out.println(bienPlace+" chiffres sont bien placés et "+malPlace+" sont mal placés.");
                 if (bienPlace == 5) {
                     victoire = true;
                 }else{
                     nbTentatives--;
                 }
             }
             if (victoire = true) {
                 System.out.println("Bravo, vous êtes le roi du mastermind !");
             } else if (nbTentatives == 0) {
                 System.out.println("Nombre de tentatives écoulées !");
             }
         } else {
             System.out.println("Bon bah au revoir !");
         }
    }

    public static String genererListeNombre() {
        Random rand = new Random();
        int[] nombresUtilises = new int[9];
        String sequence = "";

        while (sequence.length() < 5) {
            int chiffre = rand.nextInt(9) + 1;
            if (nombresUtilises[chiffre - 1] == 0) {
                nombresUtilises[chiffre - 1] = 1;
                sequence += chiffre;
            }
        }

        return sequence;
    }
}