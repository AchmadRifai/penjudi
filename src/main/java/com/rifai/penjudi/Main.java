/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifai.penjudi;

/**
 *
 * @author ai
 */
public class Main {
    private static java.util.Scanner i=new java.util.Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jum=getJum();
        i.delimiter();
        java.util.ArrayList<beans.Permintaan>a=MC.getKasusWithJum(jum);
        MC.setKemunkinan(a);
        MC.setKumulatif(a);
        MC.setInterval(a);
        MC.showPermintaan(a);
        int[]r=MC.randbeetwen(1,100);
        MC.showRandomize(r);
        MC.resultAll(a,r);
        i.close();
    }

    private static int getJum() {
        System.out.print("masukan jumlah kasus : ");
        return i.nextInt();
    }
}