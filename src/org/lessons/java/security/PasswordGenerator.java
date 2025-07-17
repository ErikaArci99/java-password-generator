package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        String name;
        String surname;
        String favoriteColor;
        int birthDay;
        int birthMonth;
        int birthYear;

        // input per i dati dell`utente

        Scanner input = new Scanner(System.in);

        // nome
        System.out.print("Inserisci il tuo nome: ");
        name = input.nextLine();

        // cognome
        System.out.print("Inserisci il tuo cognome: ");
        surname = input.nextLine();

        // colore preferito
        System.out.print("Inserisci il tuo colore preferito: ");
        favoriteColor = input.nextLine();

        // giorno di nascita
        System.out.print("Inserisci il tuo giorno di nascita: ");
        birthDay = input.nextInt();

        // mese di nascita
        System.out.print("Inserisci il tuo mese di nascita: ");
        birthMonth = input.nextInt();

        // anno di nascita
        System.out.print("Inserisci il tuo anno di nascita: ");
        birthYear = input.nextInt();

        // chiusura input
        input.close();

        // generazione della password
        String password = name + "-" + surname + "-" + favoriteColor + "-" + (birthDay + birthMonth + birthYear);

        // output della password
        System.out.println("La tua password generata è: " + password);
    }
}
