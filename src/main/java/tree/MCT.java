/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import beans.Permintaan;

/**
 *
 * @author ai
 */
public class MCT {
    private MCT ortu,kanan,kiri,tengah;
    private Permintaan p;

    public MCT(Permintaan p) {
        this.p = p;
        ortu=null;
        kanan=null;
        kiri=null;
        tengah=null;
    }

    public boolean isRoot(){
        return ortu==null;
    }

    public MCT getOrtu() {
        return ortu;
    }

    public void setOrtu(MCT ortu) {
        this.ortu = ortu;
    }

    public MCT getKanan() {
        return kanan;
    }

    public void setKanan(MCT kanan) {
        this.kanan = kanan;
        kanan.setOrtu(this);
    }

    public MCT getKiri() {
        return kiri;
    }

    public void setKiri(MCT kiri) {
        this.kiri = kiri;
        kiri.setOrtu(this);
    }

    public MCT getTengah() {
        return tengah;
    }

    public void setTengah(MCT tengah) {
        this.tengah = tengah;
        tengah.setOrtu(this);
    }

    public Permintaan getP() {
        return p;
    }

    public void setP(Permintaan p) {
        this.p = p;
    }
}