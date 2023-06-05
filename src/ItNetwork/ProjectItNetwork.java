package ItNetwork;

import java.util.Scanner;

public class ProjectItNetwork {

    public static void main(String[] args) {            //dodělat pokračování libovolnou klávesou
        Scanner sc = new Scanner(System.in);
        ManagementInsured ManagementInsured = new ManagementInsured();
        String choiceFromUser = "";
        String continueFromUser = " ";                  // zjistit proč se String nemohl jmenovat continue
        while (!continueFromUser.equals("end")){
        while (!choiceFromUser.equals("4")) {
            ManagementInsured.menuToScreen();
            choiceFromUser = sc.nextLine();
            switch (choiceFromUser) {
                case "1" -> {
                    ManagementInsured.addNewInsured();
                    continueFromUser = sc.nextLine();
                }
                case "2" -> {
                    ManagementInsured.writeAllInsureds();
                    continueFromUser = sc.nextLine();
                }
                case "3" -> {
                    ManagementInsured.searchInsured();
                    continueFromUser = sc.nextLine();
                }
                case "4" -> {
                    System.out.println("Program konci.");
                    continueFromUser = "end";
                }
                default -> System.out.println("Zadal jsi špatnou volbu.");
            }
        }
        }
    }
}
