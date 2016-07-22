/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author ai
 */
public class Permintaan {
    private int frek,interval1,interval2;
    private float prob,kum;
    private String name;

    public Permintaan(int frek, String name) {
        this.frek = frek;
        this.name = name;
        this.interval1=0;
        this.interval2=0;
        this.prob=0;
        this.kum=0;
    }

    public int getFrek() {
        return frek;
    }

    public void setFrek(int frek) {
        this.frek = frek;
    }

    public int getInterval1() {
        return interval1;
    }

    public void setInterval1(int interval1) {
        this.interval1 = interval1;
    }

    public int getInterval2() {
        return interval2;
    }

    public void setInterval2(int interval2) {
        this.interval2 = interval2;
    }

    public float getProb() {
        return prob;
    }

    public void setProb(float prob) {
        this.prob = prob;
    }

    public float getKum() {
        return kum;
    }

    public void setKum(float kum) {
        this.kum = kum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}