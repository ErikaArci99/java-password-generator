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

        // nome
        Scanner inputName = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        name = inputName.nextLine();

        // cognome
        Scanner inputSurname = new Scanner(System.in);
        System.out.print("Inserisci il tuo cognome: ");
        surname = inputSurname.nextLine();

        // colore preferito
        Scanner inputColor = new Scanner(System.in);
        System.out.print("Inserisci il tuo colore preferito: ");
        favoriteColor = inputColor.nextLine();

        // giorno di nascita
        Scanner inputBirthDay = new Scanner(System.in);
        System.out.print("Inserisci il tuo giorno di nascita: ");
        birthDay = inputBirthDay.nextInt();

        // mese di nascita
        Scanner inputBirthMonth = new Scanner(System.in);
        System.out.print("Inserisci il tuo mese di nascita: ");
        birthMonth = inputBirthMonth.nextInt();

        // anno di nascita
        Scanner inputBirthYear = new Scanner(System.in);
        System.out.print("Inserisci il tuo anno di nascita: ");
        birthYear = inputBirthYear.nextInt();
    }
}
