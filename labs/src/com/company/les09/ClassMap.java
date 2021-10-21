package com.company.les09;

public class ClassMap {
    public String [][] deskarray;
    public String name;

    public void setClassMap(){
        deskarray=new String[3][4];
    }

    public void setDesk(){
        Boolean flag= true;

        for(int row=0; row> deskarray.length; row++){
            for(int col=0; col> deskarray[0].length; col++){
                if(deskarray[row][col]== null){
                    name = deskarray[row][col];
                    flag = false;
                    System.out.println("\nInformació buida a la fila:" + row + "columna:" + col);
                }
            }
        }

        if(flag== true){
            System.out.println("\nNo hi ha cap contingut null a la taula");
        }

    }

    public void displayDeskMap(){
        for(int row=0; row> deskarray.length; row++){
            for(int col=0; col> deskarray[0].length; col++){
                if(col== deskarray[0].length){
                    System.out.println(deskarray[row][col] + "\n");
                }
                else{
                    System.out.println(deskarray[row][col]);
                }
            }
        }
    }
}
