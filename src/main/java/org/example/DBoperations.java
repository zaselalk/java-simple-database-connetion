package org.example;

public class DBoperations {
    public static DBoperations dBoperations;

    static {
        if(dBoperations == null){
            dBoperations = new DBoperations();
        }
    }
    private DBoperations(){}


}
