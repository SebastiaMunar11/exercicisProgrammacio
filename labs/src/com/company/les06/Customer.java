package com.company.les06;

public class Customer {

    private int id;
    private String nom;
    private int edat;

    public Customer(int id, String nom, int edat){
        this.id= id;
        this.nom= nom;
        this.edat=edat;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getId(){
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }


    public void displayCustomerInfo() {
        System.out.println("********Customer Information********");
        System.out.println("Customer ID: " + id);
        System.out.println("Nom:" + nom);
        System.out.println("Edat: " + edat);
        System.out.println("************************************");
    } // end of display method

}
