import java.util.Scanner;
g
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu du MasterMind !");
        System.out.println("Le MasterMind est un jeu de logique classique où le joueur tente de deviner une séquence \n" +
                "secrète de chiffres. Dans ce projet, l'objectif est de créer une version numérique du jeu en \n" +
                "utilisant le langage de programmation Java.");
        System.out.println("Les règles sont simples : ");
        System.out.println("1- La séquence secrète est composée de chiffres de 1 à 9, sans répétition.");
        System.out.println("2- Le joueur soumet des propositions de séquences, et les indices sont donnés en fonction des chiffres corrects et bien placés, ainsi que des chiffres corrects mais mal placés.");
        System.out.println("3- Le joueur a un nombre limité de tentatives pour deviner la séquence secrète. ");
        System.out.println("4- La partie se termine lorsque le joueur trouve la séquence secrète ou épuise toutes ses tentatives. ");
        System.out.println("Voulez vous commencer la partie ? (o/n)");
        String commencerPartie = clavier.nextLine().toUpperCase();
        if (commencerPartie.equals("o")) {

        }else {
            System.out.println("Bon bah au revoir !");
        }
    }
}