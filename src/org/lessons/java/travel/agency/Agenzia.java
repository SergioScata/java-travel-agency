package org.lessons.java.travel.agency;

import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vuoi andare in vacanza? (y/n)");
        String travelOrNot = scan.nextLine();
        switch (travelOrNot){
            case "y":
                System.out.println("Che tipo di vacanza vuoi fare: 1.Generica 2.Nozze 3.Gruppo");
                String travelChoice = scan.nextLine();

                if (travelChoice.equals("1") || travelChoice.equalsIgnoreCase("generica")){

                System.out.println("Dove vuoi andare?");
                String destination = scan.nextLine();

                System.out.println("Quando vuoi partire? (yyyy-mm-dd)");
                String firstDate = scan.nextLine();

                LocalDate startDate = LocalDate.parse(firstDate);
                System.out.println("Quando vuoi tornare? (yyyy-mm-dd)");
                String secondDate = scan.nextLine();
                LocalDate endDate = LocalDate.parse(secondDate);

                Vacanza vacanza = new Vacanza(destination,startDate,endDate);
                System.out.println(vacanza);
                } else if (travelChoice.equals("2") || travelChoice.equalsIgnoreCase("nozze") ) {
                    System.out.println("Dove vuoi andare?");
                    String destination = scan.nextLine();

                    System.out.println("Quando vuoi partire? (yyyy-mm-dd)");
                    String firstDate = scan.nextLine();

                    LocalDate startDate = LocalDate.parse(firstDate);
                    System.out.println("Quando vuoi tornare? (yyyy-mm-dd)");
                    String secondDate = scan.nextLine();
                    LocalDate endDate = LocalDate.parse(secondDate);

                    System.out.println("Indica il trattamento che desideri ricervere durante il viaggio: ");
                    String treatment = scan.nextLine();

                    ViaggioNozze viaggioNozze = new ViaggioNozze(destination,startDate,endDate,treatment);
                    System.out.println(viaggioNozze);
                } else if (travelChoice.equals("3") || travelChoice.equalsIgnoreCase("gruppo")) {
                    System.out.println("Dove vuoi andare?");
                    String destination = scan.nextLine();

                    System.out.println("Quando vuoi partire? (yyyy-mm-dd)");
                    String firstDate = scan.nextLine();

                    LocalDate startDate = LocalDate.parse(firstDate);
                    System.out.println("Quando vuoi tornare? (yyyy-mm-dd)");
                    String secondDate = scan.nextLine();
                    LocalDate endDate = LocalDate.parse(secondDate);

                    System.out.println("Indica il numero di persone: ");
                    int numberOfPartecipants = Integer.parseInt(scan.nextLine());
                    System.out.println("Indica il range d'eta");
                    int rangeAge = Integer.parseInt(scan.nextLine());

                    ViaggioGruppo viaggioGruppo = new ViaggioGruppo(destination,startDate,endDate,numberOfPartecipants,rangeAge);
                    System.out.println(viaggioGruppo);
                }

                break;
            case "n":
                System.out.println("Va bene, alla prossima!");
                break;
            default:
                System.out.println("Risposta non valida, riprova inserendo y/n");
                break;
        }
        scan.close();
    }
}
