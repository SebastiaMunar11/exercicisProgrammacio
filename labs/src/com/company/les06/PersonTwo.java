package com.company.les06;

public class PersonTwo {

    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public PersonTwo(){}

    public void displayPersonInfo(){
        name.append("Fernando");
        name.append(" ");
        name.append("Muro");

        System.out.println("Name: " + name.toString());
        System.out.println(name.capacity());
    }

    public static void main(String[] args) {
        PersonTwo p2 = new PersonTwo();
        p2.displayPersonInfo();
    }

}
