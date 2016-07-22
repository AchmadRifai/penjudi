/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifai.penjudi;

import beans.Permintaan;
import java.util.ArrayList;

/**
 *
 * @author ai
 */
public class MC {
    public static ArrayList<Permintaan> getKasusWithJum(int jum) {
        ArrayList<Permintaan>a=new ArrayList<Permintaan>();
        java.util.Scanner i=new java.util.Scanner(System.in);
        i.delimiter();
        for(int x=0;x<jum;x++){
            System.out.print("masukan nama index : ");
            String name=""+i.nextInt();
            System.out.print("masukan frekuensi kejadian : ");
            int frek=i.nextInt();
            a.add(new beans.Permintaan(frek, name));
            i.reset();
        }i.close();
        return a;
    }

    public static void setKemunkinan(ArrayList<Permintaan> a) {
        int totalFrek=getTotalFrek(a);
        for(int x=0;x<a.size();x++){
            Permintaan p=a.get(x);
            float f=p.getFrek();
            f/=totalFrek;
            p.setProb(f);
        }
    }

    private static int getTotalFrek(ArrayList<Permintaan> a) {
        int t=0;
        for(Permintaan p:a)t+=p.getFrek();
        return t;
    }

    public static void setKumulatif(ArrayList<Permintaan> a) {
        float t=0;
        for(int x=0;x<a.size();x++){
            Permintaan p=a.get(x);
            t+=p.getProb();
            p.setKum(t);
        }
    }

    public static void setInterval(ArrayList<Permintaan> a) {
        for(int x=0;x<a.size();x++){
            Permintaan p=a.get(x);
            if(x>0){
                Permintaan e=a.get(x-1);
                p.setInterval1(1+e.getInterval2());
            }else p.setInterval1(1);
            p.setInterval2((int) (p.getKum()*100));
        }
    }

    public static int[] randbeetwen(int i, int a) {
        int[]iki=new int[100];
        for(int x=0;x<iki.length;x++)iki[x]=getRand(i,a);
        return iki;
    }

    private static int getRand(int i, int a) {
        java.util.Random r=new java.util.Random();
        return r.nextInt(a)+i;
    }

    public static void showPermintaan(ArrayList<Permintaan> a) {
        for(Permintaan p:a){
            System.out.println("Nama : "+p.getName());
            System.out.println("Frekwensi : "+p.getFrek());
            System.out.println("Kemungkinan : "+p.getProb());
            System.out.println("Kumulatif : "+p.getKum());
            System.out.println("Interval : "+p.getInterval1()+" s/d "+p.getInterval2());
            System.out.println();
        }
    }

    public static void resultAll(ArrayList<Permintaan> a, int[] r) {
        int s=getRand(0,9),d[]=saring(r,s);
        for(int x=0;x<d.length;x++)resultThis(a,d[x]);
    }

    public static void showRandomize(int[] r) {
        int s=(int) Math.sqrt(r.length);
        for(int x=0;x<s;x++){
            for(int y=0;y<s;y++)System.out.print(""+r[(s*x)+y]+" ");
            System.out.println();
        }
    }

    private static int[] saring(int[] r, int s) {
        int i=(int) Math.sqrt(r.length),d[]=new int[i];
        for(int x=0;x<i;x++){
            int t=s*10;
            d[x]=r[x+t];
        }return d;
    }

    private static void resultThis(ArrayList<Permintaan> a, int i) {
        System.out.println("Angka random : "+i);
        for(Permintaan p:a){
            if(i>=p.getInterval1()&&i<=p.getInterval2()){
                System.out.println("Nama Permintaan : "+p.getName());
                break;
            }
        }System.out.println();
    }
}