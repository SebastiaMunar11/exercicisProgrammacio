package com.company.les09;

public class ClassMap {
    public String[][] deskArray;
    public String name;

    public void setClassMap(){
        deskArray = new String[3][4];
    }

    public void setDesk(){
        Boolean flag = false;
        for(int i=0; i< deskArray.length; i++){
            for(int j=0; j<deskArray[0].length; j++){
                if(deskArray[i][j] == null){
                    deskArray[i][j] = name;
                    System.out.println("Position: [" + i +"]" + "[" + j +"]" );
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
        if(flag == false){
            System.out.println("\nAll desks are occupied");
        }
    }

    public void displayDeskMap(){
        for(int i=0; i<deskArray.length; i++){
            for(int j=0; j<deskArray[0].length; j++){
                if(j == deskArray[0].length - 1){
                    System.out.println(deskArray[i][j]);
                }else{
                    System.out.print(deskArray[i][j] + " ");
                }
            }
        }
    }

    public void searchDesk(){
        boolean flag = false;
        for(int i=0; i< deskArray.length; i++){
            for(int j=0; j< deskArray[0].length; j++){
                if(deskArray[i][j] != null && deskArray[i][j].equals(name)){
                    System.out.println("Position: [" + i +"]" + "[" + j +"]" );
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }
        if(flag == false){
            System.out.println("Name not found");
        }
    }
}
