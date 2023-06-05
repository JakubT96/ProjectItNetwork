package ItNetwork;

import java.util.ArrayList;
public class InsuranceCompany {

    public ArrayList<Insured> databaseOfInsureds;
    public InsuranceCompany() {
        databaseOfInsureds = new ArrayList<>();
    }
    public void addNewInsured(String name, String surname, int age, int phoneNumber) {
        databaseOfInsureds.add(new Insured(name, surname, age, phoneNumber));
    }
    public ArrayList<Insured> searchInsured(String name, String surname) {
        ArrayList<Insured> successfullyFound = new ArrayList<>();
        for (Insured user : databaseOfInsureds) {{
                if (user.getName().equalsIgnoreCase(name)) {
                    successfullyFound.add(user);
                }}}
        return successfullyFound;
    }
    public ArrayList<Insured> writeAllInsureds() {
        return databaseOfInsureds;
    }

}