package ItNetwork;

public class Insured {      // jmeno,příjmeni,věk a telefon. Kontruktor + getry a setry
    public String name;         // dodělat anotaci @override String to String
    public String surname;
    public int age;
    public int phoneNumber;

    public Insured(String name, String surname, int age, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString(){
        return name + " " + surname + " "+ age + " "+ phoneNumber;
    }
}
