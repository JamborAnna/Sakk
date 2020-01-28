package com.company;

import felulet.SakkFelulet;
import logika.SakkTabla;

public class Main {

    public static void main(String[] args) {
        SakkFelulet s= new SakkFelulet();
        SakkTabla t= new SakkTabla();
        System.out.println(t);
        t.lep(6,4,4,4);
        System.out.println(t);
        t.lep(6,3,4,2);  //ervenytelen lepes
    }
}
