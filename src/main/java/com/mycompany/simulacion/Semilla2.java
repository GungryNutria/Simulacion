package com.mycompany.simulacion;

/**
 *
 * @author edgar
 */
public class Semilla2 {
    int m;
    int n;
    int a;
    int xi;
    int x0;
    float ri;
    int index;
    public void newseed(int index, int x0, int k, int c, int g){
        this.index = index;
        this.x0 = x0;
        a = 3 + (8*k);
        xi = ((a * x0) + c)%getM(g);
        ri = (float) xi / (getM(g)-1);
    }
    public void newseed(int index, int x0, int k, int g){
        this.index = index;
        this.x0 = x0;
        a = 3 + (8*k);
        xi = (a*x0) % getM(g);
        ri = (float) xi / (getM(g)-1);
    }
    public int getStop(int g){
        n = getM(g) / 4;
        return n;
    }
    public int getM(int g){
        m = (int)Math.pow(2, g);
        System.out.println(m);
        return m;
    }
    public Object[] getXi(){
        System.out.println(m);
        return new Object[]{"X"+index,String.valueOf(x0),String.valueOf(xi),ri};
    }
    public int newXi(){
        return xi;
    }
    public float getR(){
        return ri;
    }
}
