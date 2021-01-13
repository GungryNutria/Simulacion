package com.mycompany.simulacion;

public class Semilla3 extends javax.swing.JFrame{
    int [] seed;
    int c;
    public void newSeed(int[] xi, int index, int m, int psem){
        this.seed = new int[xi.length];
        this.seed = xi;
        this.c = index;
        for (int i =c; i < seed.length; i++) {
            seed[i] = generateNSeed(index, m, psem);
            index++;
            System.out.println(seed[i]);
        }
    }
    public int generateNSeed(int index, int m, int psem){
        int s = (seed[index-1]+seed[index-psem])%m;
        
        return s;
    }
    public int[] getNewSeed(){
        
        return seed;
    }
}
