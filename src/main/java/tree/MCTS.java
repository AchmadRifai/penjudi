/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author ai
 */
public class MCTS {
    @SuppressWarnings("UnusedAssignment")
    public static void addNode(MCT root,MCT n){
        if(root!=null){
            if(root.getP().getProb()>n.getP().getProb())kiri(root,n);
            else if(root.getP().getProb()<n.getP().getProb())kanan(root,n);
            else tengah(root,n);
        }else root=n;
    }

    private static void kiri(MCT root, MCT n) {
        if(null!=root.getKiri()){
            if(root.getKiri().getP().getProb()>n.getP().getProb())kiri(root.getKiri(),n);
            else if(root.getKiri().getP().getProb()<n.getP().getProb())kanan(root.getKiri(),n);
            else tengah(root.getKiri(),n);
        }else root.setKiri(n);
    }

    private static void kanan(MCT root, MCT n) {
        if(null!=root.getKanan()){
            if(root.getKanan().getP().getProb()>n.getP().getProb())kiri(root.getKanan(),n);
            else if(root.getKanan().getP().getProb()<n.getP().getProb())kanan(root.getKanan(),n);
            else tengah(root.getKanan(),n);
        }else root.setKanan(n);
    }

    private static void tengah(MCT root, MCT n) {
        if(null!=root.getTengah()){
            if(root.getTengah().getP().getProb()>n.getP().getProb())kiri(root.getTengah(),n);
            else if(root.getTengah().getP().getProb()<n.getP().getProb())kanan(root.getTengah(),n);
            else tengah(root.getTengah(),n);
        }else root.setTengah(n);
    }

    public static java.util.ArrayList<beans.Permintaan> selection(MCT root){
        java.util.ArrayList<beans.Permintaan>a;
        return null;
    }
}