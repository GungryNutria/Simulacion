
package com.mycompany.simulacion;

import java.util.ArrayList;

public class Semilla {
    String newSeed;
    String doubleSeed;
    int sizedouble=0;
    int sizesingle=0;
    int sizesingle2=0;
    int tope = 0;
    int pseudo=0;
   char [] seed;
    public void newSeed(String seed,String side){
        int size = seed.length();
        sizesingle=size;
        doubleSeed = seedConfirm(seed,side,size);
        setArraySeed(doubleSeed);
    }
    public void newSeedProduct(String seed1, String seed2, String side){
        int size1 = seed1.length();
        int size2 = seed2.length();
        sizesingle = size1;
        sizesingle2= size2;
        doubleSeed = seedConfirm(seed1, seed2, side, size1, size2);
        setArraySeed(doubleSeed);
    }
    public void setArraySeed(String doubleSeed){
        int size = doubleSeed.length();
        String newSeed = doubleSeed;
        seed = new char[size];
        for (int i = 0; i <= size-1; i++) {
            seed[i] = newSeed.charAt(i);
        }
        this.newSeed = getNewSeed(seed);
    }
    public String getNewSeed(char [] seed){
        int inicio = (sizedouble - sizesingle) / 2;
        int ultimo = sizesingle+inicio;
        String semilla = "";
        for (int i = inicio; i < ultimo; i++) {
            semilla += seed[i];
        }
        return semilla;
    }
    public String seedConfirm(String seed, String lado, int size){
        if ((size%2)== 0) {
            return doubleSeed = isPar(Long.parseLong(seed),lado);
        }else{
            return doubleSeed = isNone(Long.parseLong(seed), lado);
        }
    }
    public String seedConfirm(String seed1,String seed2, String lado, int size1, int size2){
        if ((size1%2)==0) {
            return doubleSeed = isPar(Long.parseLong(seed1), Long.parseLong(seed2), lado);
        }else{
            return doubleSeed = isNone(Long.parseLong(seed1), Long.parseLong(seed2), lado);
        }
    }
    public String isPar(long seed1, long seed2,String side){
        String parseed = String.valueOf(seed1*seed2);
        int size = parseed.length();
        if ((size%2) != 0) {
            parseed = setZero(Long.parseLong(parseed), side);
        }
        sizedouble = parseed.length();
        return parseed;
    }
    public String isNone(long seed1, long seed2,String side){
        String noneseed = String.valueOf(seed1*seed2);
        System.out.println(noneseed);
        int size = noneseed.length();
        if ((size%2) == 0) {
            noneseed = setZero(Long.parseLong(noneseed), side);
        }
        sizedouble = noneseed.length();
        return noneseed;
    }
    public String isPar(long seed, String side){
        String parseed = String.valueOf(seed*seed);
        int size = parseed.length();
        if ((size%2) != 0) {
            parseed = setZero(Long.parseLong(parseed), side);
        }
        sizedouble = parseed.length();
        return parseed;
    }
    public String isNone(long seed, String side){
        String noneseed = String.valueOf(seed*seed);
        System.out.println(noneseed);
        int size = noneseed.length();
        if ((size%2) == 0) {
            noneseed = setZero(Long.parseLong(noneseed), side);
        }
        sizedouble = noneseed.length();
        return noneseed;
    }
    public String setZero(long seed, String side){
        String myseed = String.valueOf(seed);
        switch (side){
            case "Izquierda":
                myseed = "0"+myseed;
            break;
            case "Derecha":
                myseed += "0";
            break;
          
        }
        return myseed;
    }
    public String getSeedDouble(){
        return String.valueOf(doubleSeed);
    }
    public String getSeedSingle(){
        return String.valueOf(newSeed);
    }
}
