package com.company.les10;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {
   
  public static void main (String args[]) {
    Customer_10 customer1 = new Customer_10();
    Customer_10 customer2 = new Customer_10();

    customer1.setCustomerinfo(1, "Pep", "Manacor", "679916865");
    customer2.setCustomerinfo(2, "Maikol", "Artà", "679916866", "smunaralcover11");

    customer1.displayCustomer();
    customer2.displayCustomer();

  } 
}
