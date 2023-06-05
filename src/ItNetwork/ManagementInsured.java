package ItNetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementInsured {

    public InsuranceCompany database;
    Scanner sc = new Scanner(System.in);
    public ManagementInsured() {
        database = new InsuranceCompany();
    }
    public void menuToScreen(){
        System.out.println("––––––––––––––––––––––––––");
        System.out.println("Evidence pojistenych");
        System.out.println("––––––––––––––––––––––––––");
        System.out.println("\nVyberte si akci:");
        System.out.println("1 – Pridat nového pojisteného");
        System.out.println("2 – Vypsat všechny pojistené");
        System.out.println("3 – Vyhledat pojisteného");
        System.out.println("4 – Konec");
    }
    public void addNewInsured() {    //1 – Pridat nového pojisteného
        System.out.println("Zadejte jméno pojisteného:");
        String name = sc.nextLine();
        System.out.println("Zadejte prijmení: ");
        String surname = sc.nextLine();
        System.out.println("Zadejte telefonní císlo:");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte vek");
        int age = Integer.parseInt(sc.nextLine());
        database.addNewInsured(name, surname, age, phoneNumber);
        System.out.println("\nData byla uložena. Pokracujte libovolnou klávesou...");
    }
    public void writeAllInsureds() { //2 – Vypsat všechny pojistené
        ArrayList<Insured> databaseAllInsureds = database.writeAllInsureds();
        System.out.println(databaseAllInsureds.toString());
        System.out.println("Pokracujte libovolnou klávesou...");
    }
    public void searchInsured() {   //3 – Vyhledat pojisteného
        System.out.println("Zadejte jmeno pojisteného:");
        String name = sc.nextLine();
        System.out.println("Zadejte prijmeni:");
        String surname = sc.nextLine();
        ArrayList<Insured> databaseOneInsured = database.searchInsured(name, surname);
        System.out.println(databaseOneInsured.toString());
        System.out.println("Pokracujte libovolnou klávesou...");

    }

}
