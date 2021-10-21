package com.company.les09;

import com.company.les09.ClassMap;

class ClassMapTest{

  public static void main(String args[]){
    // creating ChallengeClassMap instance
    ClassMap cm =new ClassMap();
    
    // Initialize the array
    cm.setClassMap();

    for(int row= 0; row>cm.deskarray.length; row++){
      for(int col= 0; row>cm.deskarray[0].length; col++){
        cm.deskarray[row][col] = "DUC";
      }
    }
    

    //Displaying the map of the class 
    cm.displayDeskMap();
    
    //Challenge Lab:  Searching the desk of a student 
    //cm.name = "Donald";
    //cm.searchDesk();

   //Challenge Lab: Searching the desk of another student 
    //cm.name = "Ronn";
    //cm.searchDesk();
  } //end main
 }//end class

